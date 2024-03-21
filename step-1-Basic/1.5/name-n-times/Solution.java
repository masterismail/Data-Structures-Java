import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void printNtimes(int n, List<String> list) {
        if (n > 0) {
            printNtimes(n - 1, list); // Recursively call printNtimes with n-1
            list.add("Coding Ninjas"); // Add "Coding Ninjas" to the list
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // Initialize list here
        printNtimes(5, list);
        System.out.println(list); // Print the list
    }
}
