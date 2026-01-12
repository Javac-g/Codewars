package StripComments;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//"apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }
public class Strip {
  
    public static String testTwo(String text, String[] commentSymbols){
        String alt = Arrays.stream(commentSymbols)
                .map(Pattern::quote)
                .collect(Collectors.joining("|", "(?:", "|(?!x)x)"));

        return text.replaceAll("[ \\t]*(?:" + alt + ").*(\\r?\\n|$)", "$1");
    }
}
