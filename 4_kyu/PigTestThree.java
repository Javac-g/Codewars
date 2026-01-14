package PigLatin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigTestThree {
    public static String process (String str){
        return Arrays.stream(str.split(" "))
                .map(w -> w.matches("\\p{Punct}") ? w : w.substring(1) + w.charAt(0) + "ay")
                .collect(Collectors.joining(" "));

    }
}
