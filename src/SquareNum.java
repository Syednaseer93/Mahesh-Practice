
public class SquareNum {
int findSquare(int num)
{
	int res=num*num;
	return res;
}
	

	public static void main(String[] args) {
		
		SquareNum s=new SquareNum();
		//System.out.println(s.findSquare(15));
     int result=s.findSquare(4);
     System.out.println(result);
	}

}
