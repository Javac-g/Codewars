import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayLeader {
    public static List<Integer> arrayLeaders(int[] numbers) {
        List<Integer> leaders = new ArrayList<>();
        
        IntStream.range(0, numbers.length)
                 .mapToObj(i -> new int[]{numbers[i], 
                                         IntStream.of(numbers).skip(i + 1).sum()})
                 .filter(pair -> pair[0] > pair[1])
                 .forEach(pair -> leaders.add(pair[0]));
        
        return leaders;
    }
}
