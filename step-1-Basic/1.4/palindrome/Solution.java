import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int inn = sc.nextInt();
        int comp = inn;
        sc.close();

        int l;
        int newNum=0;

        while (inn > 0) {
            l = inn % 10;
            newNum = newNum*10+l;
            inn = inn/10;

        }

        if (newNum==comp){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }
        

        System.out.println(newNum);

        
        
		
	}
}