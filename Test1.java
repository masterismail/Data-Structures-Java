import java.util.*;

public class Test1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     int inputNumber = sc.nextInt();
     int rem;
     int sum=0;
     while(inputNumber > 0) {
        rem = inputNumber%10;
        sum = sum+rem;
        inputNumber = inputNumber/10;
    }
    System.out.println(sum);
}
}