package BinaryTree;

import java.util.*;
import java.util.stream.Stream;

public class BinaryTreeLevels {



    static List<Integer> process(Node r) {
        Queue<Node> q = new ArrayDeque<>(List.of(r));
        return Stream.generate(q::poll).takeWhile(Objects::nonNull)
                .peek(n -> { if (n.left != null) q.add(n.left); if (n.right != null) q.add(n.right); })
                .map(n -> n.getValue()).toList();
    }
    public static void main(String... args){


        System.out.println(process(new Node   (
                new Node(null, new Node(null, null, 4), 2),
                new Node(new Node(null, null, 5), new Node(null, null, 6), 3),
                1)));



    }
}
