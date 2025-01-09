import java.util.Arrays;
class StrongNumber {
  
    public static int fact(int c){
      
        int L = 1;
      
        for(int i = 1 ; i <=c; i++){
          
            L = L*i;
          
        }
         
        return L;
    }
  
    public static String isStrongNumber(Integer num) {
      
      if(num > 9){
        
        String n = String.valueOf(num);
        
        char[] digits = n.toCharArray();
        
   
        
        int H = 1;
        
        for(int j = 0;j < digits.length;j++){
          
          int a = Character.getNumericValue(digits[j]);
          
          H  += fact(a);
          
        }
        
        
        
        if(H == num){
          return"STRONG!!!!";
            }
            return "Not Strong !!";
        
       
        
      }else if(num <=9){
        
        if(num == fact(num)){
          
          return"STRONG!!!!";
        }
        return "Not Strong !!";
      }
      return null;
    }

}
