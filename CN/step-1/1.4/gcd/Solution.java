public class Solution {
    public static int calcGCD(int n, int m){
        int g=0;
        int gre = 0;

        if(n>m){
            gre=n;
        }
        else{
            gre=m;
        }
        
        for(int i=1;i<=gre;i=i+1){
            try{
            if(n%i==0 & m%i==0){
                g=i;
            }
            }catch(ArithmeticException e){
             
            }
        }
        
        System.out.println(g);
        return n;
    }



public static void main(String[] argument){
    calcGCD(2, 5);
}
}