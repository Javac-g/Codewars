import java.lang.StringBuilder;
import java.util.*;
public class PigLatin {
  
    public static String pigIt(String str) {
        System.out.println(str);
        String[] word = str.split(" ");
      
        for(int i = 0;i <word.length;i++){
          word[i]=word[i].substring(1)+ word[i].substring(0,1).replaceAll("!","") ;
          if(word[i].length()>0){
             word[i]+= "ay";
         }
       }   
      return new String(String.valueOf(Arrays.toString(word)).replaceAll("]|\\[|\\_|\\-|\\,",""));
    }
}
