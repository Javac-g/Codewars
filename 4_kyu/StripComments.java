public class StripComments {
    public static String test(String text, String[] commentSymbols) {
        Pattern p = Pattern.compile(
                "(?m)(?:[ \\t]*(?:" +
                        Arrays.stream(commentSymbols)
                                .map(Pattern::quote)
                                .collect(Collectors.joining("|", "(?:", "|(?!x)x)")) +
                        ").*$|[ \\t]+$)"
        );

        return p.matcher(text).replaceAll("").replace("\r\n", "\n");

    }
