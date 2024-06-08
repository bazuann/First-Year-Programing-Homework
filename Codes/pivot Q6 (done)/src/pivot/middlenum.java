package pivot;
import java.util.Arrays;
import  java.util.Scanner;
public class middlenum {
	public static void partition(int [] list,int size) {
		int pivot = list[0];
		int i =0;
		int a = 0;
		int c = 0;
		int k = 0;
		int y = 0;
		int [] little = new int [size];
		int [] big = new int [size];
		int [] last = new int [size];  
        while(i < size) {
        	if(pivot > list[a]) {
        		little[y] = list[a];
        		y++;
        		c++;
        	}
        	a++;
        	i++;
        }
        i = 0;
        a = 0;      
        while(i < size) {
        	if(pivot < list[a]) {
        		big[k] = list[a];
        		k++;
        	}       	
        	a++;
        	i++;	
        }
	    i = 0;    
	 
	    while(i < c) {
	    	last[i] = little[i]; 
	    	i++;
	    }
	    
      last[c] = pivot;
      c = c + 1;
      i = 0;
        while(c < size) {
		last[c] = big[i];
		i++;
		c++;		
	}
	
        System.out.println(Arrays.toString(last));
	
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
		 partition(array,size);	 
	}
}
