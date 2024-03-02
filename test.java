// Java Program to Convert Integer Values into Binary

// Importing Classes/Files
import java.io.*;

class test {
	// Function converting decimal to binary
	static void decimalToBinary(long num)
	{
		// Function to print integer to binary using
		// inbuilt toBinaryString method
		System.out.println(Long.toBinaryString(num));
	}

	// Main driver function
	public static void main(String[] args)
	{
		// Number to be converted into binary
		long num = 12;

		// Calling function
		decimalToBinary(num);
	}
}
