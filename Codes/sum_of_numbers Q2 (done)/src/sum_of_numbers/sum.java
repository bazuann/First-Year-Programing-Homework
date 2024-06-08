package sum_of_numbers;

public class sum {
	
	public static double sum(int n)
    {
      double i, s = 0.0;
      for (i = 1; i <= n; i++)
          s = s + i/(i+1);
      return s;
    }
	public static void main(String[] args) {

		 int n = 19;
	        System.out.printf("Sum is %f", sum(n));	
	}
}
