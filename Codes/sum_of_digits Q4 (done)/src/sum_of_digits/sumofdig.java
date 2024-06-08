package sum_of_digits;
import java.util.Scanner;

public class sumofdig {
	
	public static int sumDigits(long num) {
		int sum = 0;
		int zart = 0;
		while(num != 0) {
			zart =(int) (num % 10);
			sum = (int) (sum + zart);
			num = num / 10;			
		}
		
		return sum;
	}	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number");
		long num = sc.nextInt();

		System.out.printf("the total is : %d",sumDigits(num));
			
	}

}
