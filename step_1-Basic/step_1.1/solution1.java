import java.util.Scanner;

public class solution1 {
    public static void main(String[] args) {
        //System.out.println("hello world");
        
        try (Scanner obj = new Scanner(System.in)) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            char character = input.charAt(0);
            //System.out.println(character);

            if (Character.isUpperCase(character)){
                System.out.println("is upper case");
            }
            else if (Character.isLowerCase(character)){
                System.out.println("is lower case");
            }
            else {
                System.out.println("is number");
            }



        }
    }
}
