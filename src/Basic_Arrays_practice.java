import java.util.Iterator;

public class Basic_Arrays_practice {
  //PRINTING FIRST HALF AND LAST HALF OF AN ARRAY
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50,60,70};
		System.out.println("Printing first half....");
		for(int i=0;i<=nums.length/2;i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println("Printing last half....");

		for(int i=nums.length-1;i>=nums.length/2;i--)
		{
			System.out.println(nums[i]);
		}
	}
}
