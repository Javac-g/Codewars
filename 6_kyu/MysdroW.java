import java.util.Arrays;
public class MysdroW  {

  public String spinWords(String str) {
    
   String[] arr = str.split(" ");

        for (int i = 0; i < arr.length;i++){

            if (arr[i].length() >= 5){

                StringBuffer stringBuffer = new StringBuffer(arr[i]);

                arr[i] = String.valueOf(stringBuffer.reverse());
            }
        }

        String  result = new String(Arrays.toString(arr).replaceAll("[\\[\\]\\,]",""));
        return result;
    }
  }
