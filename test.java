import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int EvenSum = 0;
		int OddSum =0;
        int last=0;
		int n = sc.nextInt();


		
			
		
        while (n>0){
		 last = n%10;
         //System.out.println((last));
         n=n/10;
         //System.out.println((n));
        
        if (last %2==0){
            EvenSum+=last;
        }

        else if (last %2!=0){
            OddSum+=last;
        }
         
    }
		// if (last%2 == 0){
		// 	EvenSum+=last;
		// }

		// else if (last%2 != 0){
		// 	OddSum+=last;
		// }
	
	

		System.out.print(""+EvenSum+""+OddSum);
        
		
        }

	
        }

    