
public class ArrayUtility {
		//using array in a method parameter
		static void display(int[] arr) {
			for(int i:arr)
			{
				System.out.print(i+"  ");
			}
		}
		public static void main(String[] args) {
			int [] nums= {10,20,30,40};
			display(nums);
		}
	}

	
