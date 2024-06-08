package sorter;
import java.util.Scanner;
import java.util.Arrays;

public class sort {
	public static String sort(String s) {

		char Array[] = s.toCharArray();	
		Arrays.sort(Array);		
	
        return new String(Array);
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the string");
		String string= sc.nextLine();
				
		System.out.println(sort(string));
		
	}
}
