import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double sum=0;
        int n= sc.nextInt();
        sc.close();
        int m=n;
        double res = m;
        
        int count =0;
        int l;
        int o;
        
         
        while (n>0){
            l=n%10;
            count+=1;
            


            n=n/10;
        }
        
        while (m>0){
            o=m%10;
            
            sum = sum+Math.pow(o, count); 
            
            m=m/10;
        }
        if(res==sum){
        System.out.println(true);
        }
        else{
            System.out.println(false);

        }

	}
}
