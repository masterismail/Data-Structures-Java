public class Solution {
    public static int sumOfAllDivisors(int n){
        
        int megaSum =0;

        for(int i=1;i<=n;i=i+1){
            int sumOfDiv =0;
            //System.out.println("at i="+i);
            for(int j=1;j<=i;j=j+1){
                //System.out.println("at j="+j);
            if(i%j==0){
                sumOfDiv = sumOfDiv + j;
                

            }
            
        }
            //System.out.println(sumOfDiv);
            megaSum = megaSum+sumOfDiv;
        }
        //System.out.println(megaSum);

        return megaSum;
    }



    public static void main(String[] argument){
       int res = sumOfAllDivisors(3);
       System.out.println(res);
    }
}