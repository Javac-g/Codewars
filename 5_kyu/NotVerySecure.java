public class SecureTester{
  
  public static boolean alphanumeric(String s){

    if(s.isEmpty()){ 
      return false;
      }
   String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        for (char c : s.toCharArray()) {
            if (!allowedChars.contains(String.valueOf(c))) {
                System.out.println(s);
                return false;
            }
        }
        
        return true;
    }

}
