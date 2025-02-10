package kata.kyu4;

import java.util.HashMap;
import java.util.Map;

public class BattleShips {
    private static final String SUNK = "sunk";
    private static final String DAMAGED = "damaged";
    private static final String NOT_TOUCHED = "notTouched";
    private static final String POINTS = "points";

    public static Map<String, Double> damagedOrSunk(final int[][] board, final int[][] attacks) {
        Map<Integer, Integer> shipsPre = getShipCounts(board);
        applyAttacks(board, attacks);
        Map<Integer, Integer> shipsPost = getShipCounts(board);

        return computeResults(shipsPre, shipsPost);
    }

    private static Map<Integer, Integer> getShipCounts(int[][] board) {
        Map<Integer, Integer> shipCounts = new HashMap<>();
        for (int[] row : board) {
            for (int cell : row) {
                if (cell > 0) shipCounts.merge(cell, 1, Integer::sum);
            }
        }
        return shipCounts;
    }

    private static void applyAttacks(int[][] board, int[][] attacks) {
        for (int[] attack : attacks) {
            int row = board.length - attack[1];
            int col = attack[0] - 1;
            board[row][col] = 0; // Mark as hit
        }
    }

    private static Map<String, Double> computeResults(Map<Integer, Integer> shipsPre, Map<Integer, Integer> shipsPost) {
        Map<String, Double> result = new HashMap<>(Map.of(SUNK, 0.0, DAMAGED, 0.0, NOT_TOUCHED, 0.0));

        for (var entry : shipsPre.entrySet()) {
            int shipId = entry.getKey();
            int initialCount = entry.getValue();
            int remainingCount = shipsPost.getOrDefault(shipId, 0);

            switch (Integer.compare(remainingCount, initialCount)) {
                case 0 -> result.merge(NOT_TOUCHED, 1.0, Double::sum);
                case -1 -> result.merge(remainingCount > 0 ? DAMAGED : SUNK, 1.0, Double::sum);
            }
        }

        result.put(POINTS, result.get(SUNK) + result.get(DAMAGED) * 0.5 - result.get(NOT_TOUCHED));
        return result;
    }
}
