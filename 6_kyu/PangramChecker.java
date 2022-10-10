import java.util.*;
public class PangramChecker {
  public boolean check(String s){
    
    char[] f = s.toLowerCase().replace(" ","").toCharArray();
    
    Set<Character> pool = new HashSet<>();
    
    for(int i = 0; i<=f.length-1;i++){
      
     for(char c ='a';c<='w';c++){
       
       if(f[i]==c)pool.add(c);
       
     }
      
    }
    
    return pool.size() >= 26 ? true: false;
    
    }
}
