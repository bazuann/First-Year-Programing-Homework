package same4num;
import java.util.Scanner;
public class num {

	public static boolean nums(int [] values,int size) {
		int i = 0;
		int a = 1;
		int z = 0;	
		size = size -1 ;
		while(i != size) {
				if(values[i] == values[a]) {
					z++;					
					if(z >= 3) {
						return true;
					}
				}				 
				else {
					z = 0;
				}
				a++;
				i++;
		}
		if(z >= 3) {
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
		 
		if(nums(array,size) == true) {
			System.out.println("The list has consecutive fours");
		}
		else {
			System.out.println("The list has no consecutive fours");
		}
	}
}
