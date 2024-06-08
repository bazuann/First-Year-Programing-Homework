package reverse_numbers;
import java.util.Scanner;

public class reverse {
	
	public static void reverse(int num) { 
		int reversenum = 0;		
		while(num != 0) {
			int remainder = num % 10;  
			reversenum = reversenum * 10 + remainder;  
			num = num/10; 
		}
		System.out.println(reversenum);
	}
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
			
		reverse(num);
	}
}
