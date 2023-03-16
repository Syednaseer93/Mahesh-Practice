import java.util.Scanner;

public class DoWhileAddNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=null;
		do
		{
			System.out.println("Enter the two Numbers");
			int x=s.nextInt();
			int y=s.nextInt();
			System.out.println("Sum is:");
			System.out.println(x+y);
			System.out.println("Do you want to add again?");
			input=s.next();

		}while("yes".equalsIgnoreCase(input));

	}

}
