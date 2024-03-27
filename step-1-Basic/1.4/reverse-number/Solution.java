import java.util.*;
public class Solution {
	public static long reverseBits(long n) {
           Scanner sc = new Scanner(System.in);
           int maxSize = n;
           int numberArray[] = new int[maxSize]; 
           
           for(int i=0;i<=n;i++){
             numberArray[i] = sc.nextInt() ; 
           }
            System.out.println(n);
            return n;
	}


public static void main(String[] args) {
    reverseBits(0);
}
}