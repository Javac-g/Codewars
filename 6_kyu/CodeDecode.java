import java.util.*;
class CodeDecode {
    
    public static String code(String s) {
      char[] c = s.toCharArray();
        String[] str = new String[c.length];
        for(int i = 0;i <=str.length-1;i++){
            str[i] = String.valueOf(c[i]);
            str[i] = str[i].replaceAll("1","11")
                            .replaceAll("0","10")
                            .replaceAll("2","0110")
                            .replaceAll("3","0111")
                            .replaceAll("4","001100")
                            .replaceAll("5","001101")
                            .replaceAll("6","001110")
                            .replaceAll("7","001111")
                            .replaceAll("8","00011000")
                            .replaceAll("9","00011001");
            
            
        }
        
        String test = new String(Arrays.toString(str).replaceAll("[\\[\\]\\, ]",""));
      return test;
        
    }
    
    public static String decode(String s) {
        String sb = s
        .replaceAll("00011001","9")
         
        .replaceAll("001111","7")
        .replaceAll("001110","6")
        .replaceAll("001101","5")
        .replaceAll("001100","4")
        .replaceAll("0111","3")
        .replaceAll("0110","2")
        .replaceAll("11","1")
        .replaceAll("10","0").replaceAll("00011000","8")
        ;
            return sb;
    }
}
