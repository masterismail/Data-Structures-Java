import java.util.*;

public class reverseArray{

    public static void reverseArrayy(int[] array){
      
    //  for(int num:array) { 
	// 	System.out.print(num + " ");  
	//  }
    
	 int lengthOfArray = array.length;

	 for(int i=lengthOfArray-1;i>=0;i--){
		System.out.print(array[i]+" ");
	 }




	}
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

		int newArray[] = new int[n];
		System.out.println("\nEnter elements of the array:");
		for (int i=0; i<n; i++)  
            newArray[i] = sc.nextInt();
		reverseArrayy(newArray);
}
}


