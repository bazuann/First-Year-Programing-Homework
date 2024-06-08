package password_checker;
import java.util.Scanner;
public class password {

	public static void main(String[] args){
		
	Scanner sc= new Scanner(System.in);          // Create a Scanner object
	System.out.println("Enter a new password: ");  
	String password= sc.nextLine();       // Read user input

	int a = 0;
	int len = password.length();
    int b = 0;
    int z = 0;
    int y = 0;
    
    if (password.length() >= 8){
		a = a +1;
	}
    
    for (int i = 0; i < len; i++) {
       if ((Character.isDigit(password.charAt(i)) == true)) {      //this checks character is digit or not
          b = b + 1;
              }	
     }
  
    for (int k = 0; k < len; k++) {
        if ((Character.isLetterOrDigit(password.charAt(k)) == true)) {    //this checks character is letter or not
           z = z + 1;
               }	
      }
     
     if(z == len) {
    	 y = 1;
     }
     
     if(y == 1 && b >= 2 && a == 1) {
    	 System.out.println("password is valid");
     }
     else {
    	 System.out.println("password is invalid");
     }
}		
}
