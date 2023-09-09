import java.util.stream.*;
import java.util.*;

public class Kata {
  public static String createPhoneNumber(int[] numbers) {
   if (numbers.length != 10) {
      throw new IllegalArgumentException("Input array must contain exactly 10 digits");
    }

    String phoneNumber = IntStream.of(numbers)
      .mapToObj(String::valueOf)
      .collect(Collectors.joining());

    return String.format("(%s) %s-%s", phoneNumber.substring(0, 3), phoneNumber.substring(3, 6), phoneNumber.substring(6));
  
  }
}
