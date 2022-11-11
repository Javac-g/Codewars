import java.lang.StringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution{

  static String toCamelCase(String s){
    return Pattern.compile("[-|_](.)").matcher(s).replaceAll(r -> r.group(1).toUpperCase());
  }
}
