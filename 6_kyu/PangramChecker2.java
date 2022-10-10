import java.util.*;
import java.util.stream.*;

public class PangramChecker {
  public boolean check(String s){
    Set<Character> set = s.toLowerCase().chars()
      .mapToObj(e->(char)e)
      .collect(Collectors.toSet());
    
    return set.size()>26 ? true:false;
    
    }
}
