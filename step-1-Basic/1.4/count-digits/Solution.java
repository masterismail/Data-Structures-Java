public class Solution {
    public static int countDigits(int n) {
        int count=0;
        int l; // to store a digit (last digit)
        int d = n; // to store the constant value to divide by 
        

        while (n>0){
        l = n%10;
        try {
        if (d%l==0){
        
                      System.out.println("result = "+n%l+"n ="+n+"l="+l);
        count=count+1;
        }
    
    

        n=n/10;
    }catch(ArithmeticException e){
        n=n/10;
        
    }
    }
        return count;
    

}   


    
    public static void main(String[] argument) {
        int result = countDigits(660);
        System.out.println(result);
    }
}

