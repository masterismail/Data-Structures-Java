
import java.util.*;

public class Test{
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int count = 0;
		
		for(int i=1;i<=number1;i++) {
		  if (number1%i==0) {r
			count++;
		}
		}
		
		if (count == 2) {
			System.out.print("prime");
		}
			else {
				System.out.print("not primt");
			}
		}
	}
