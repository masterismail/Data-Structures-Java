import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int EvenSum = 0;
		int OddSum =0;
		int n = sc.nextInt();


		while (n>0) {
			
		

		int last = n/10;

		if (last%2 == 0){
			EvenSum+=last;
		}

		else if (last%2 != 0){
			OddSum+=last;
		}
	}
	

		System.out.println(EvenSum);
		System.out.println(OddSum);


	
}
}
