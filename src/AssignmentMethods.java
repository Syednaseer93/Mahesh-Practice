
public class AssignmentMethods {
int add(int a, int b)
	{
		return a+b;
	}
	void sub(int a, int b)

	{
		System.out.println(a-b);

	}
	void mul(int a, int b)
	{
		System.out.println(a*b);

	}
	void div(int a, int b)
	{
		System.out.println(a/b);

	}

	public static void main(String[] args) {
		AssignmentMethods am=new AssignmentMethods();
		int addresult=am.add(10,10);	
		System.out.println(addresult);
		am.sub(10, 10);
		am.mul(10, 10);
		am.div(10, 10);
	}

}
