import java.util.Scanner;

public class DoWhileScanner {

	/*public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=null;
		do
		{		System.out.println("*");
			System.out.println("DO YOU WANT TO PRINT AGAIN?");
			 input=s.next();
	}while("yes".equalsIgnoreCase(input));
}*/
	public static void main(String[] args) 
	{
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
	}
}

