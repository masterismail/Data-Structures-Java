// package CN.fibonacci;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int inputt = sc.nextInt();

        if (inputt == 1){
            System.out.println(1);
        }
        // sc.close();
        else if (inputt == 2){
            System.out.println(1);
        }

        else {
            int result = (inputt-1) + (inputt-2);
            System.out.println(result-1);
        }
        
        

		
	}

}
