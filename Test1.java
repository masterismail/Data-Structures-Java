public class Test1 {
    public static int[] printNos(int x) {
       int[] resultArray = new int[x+1];
        
        if (x > 0) {
            resultArray[x]=x;
            printNos(x - 1);
             // Recursively call printNos with x-1
            // System.out.print(x); // Print the current value of x
        }
      
        return resultArray;
    }

    public static void main(String[] args) {
        printNos(5);
    }
}
