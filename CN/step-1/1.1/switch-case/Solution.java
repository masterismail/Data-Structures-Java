import java.math.BigDecimal;

public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        double pi = 3.14159265359;
        switch (ch) {
            case 1:

              return a[0]*a[1];
              
                
            
        
            case 2:



            return pi*a[0]*a[0];
            
                default:
                return a[0];
        }
    }



public static void main(String[] arg) {
   
    double[] values = {3,2};
    double result = areaSwitchCase(1, values);

    System.out.println(result);
}
}