package sortnum;
import java.util.Scanner;

public class sort {
	
	public static boolean isSorted(int [] list ,int size) {	
		int a = 1;
		int i = 0;
		int z = 0;
		size = size - 1;
		while(i != size) {
			if(list[i] <= list[a]) {
				z++;
			}
			a++;
			i++;
		}
		
		if(z == size) {
			return true;
		}		
		else {
			return false;
		}	
	}

	public static void main(String[] args) {
	
		Scanner sizeof= new Scanner(System.in);
		System.out.println("enter the size");
		int size = sizeof.nextInt();
		
		int[] array = new int[size];  
		
		 Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter the elements of the array: ");  
	
		 for(int i=0; i != size; i++)  
		 {  
		 array[i]=sc.nextInt();  
		 }  
		
		if(isSorted(array,size) == true) {
			System.out.println("the list is already sorted");
		}
		
		else {
			System.out.println("the list is not sorted");
		}
	}
}
