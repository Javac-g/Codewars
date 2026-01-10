public class BetterPigLatin{

  public static String pigIt(String str){
   
        return str.replaceAll("\\b(\\p{L})(\\p{L}*)\\b", "$2$1ay");

    }

}
