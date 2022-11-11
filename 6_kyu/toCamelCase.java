import java.lang.StringBuilder;
import java.util.*;
class Solution{

  static String toCamelCase(String s){
    
    String[] c = s.split("-|\\_");
    
    for(int i = 1; i < c.length ; i++) { c[i] =  String.valueOf ( Character.toUpperCase( ( c[i].charAt(0) ) ) ) + c[i].substring(1) };
    
    return  new String(String.valueOf(Arrays.toString(c)).replaceAll("]|\\[|\\ |\\_|\\-|\\,",""));
    
    
  }
}
