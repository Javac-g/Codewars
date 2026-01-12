public class StripCommentsTwo{

  public static String stripComments(String text, String[] commentSymbols) { return text.replaceAll("(?m)\\h*([" + String.join("",commentSymbols) + "].*)?$", ""); }
}
