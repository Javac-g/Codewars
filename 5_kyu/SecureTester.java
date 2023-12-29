import java.util.stream.Stream;

public class SecureTester {

    public static boolean alphanumeric(String s) {
        if (s.isEmpty()) {
            return false;
        }

        String allowedCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        return s.chars().allMatch(c -> allowedCharacters.contains(String.valueOf((char) c)));
    }
}
