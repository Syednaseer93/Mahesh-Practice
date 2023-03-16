import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("Naseer");
		list.add(true);
		list.add(1243);
		list.add(1243);
		list.add(134.34);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);   
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		ArrayList list2=new ArrayList();
		list2.add(100);
		list2.addAll(list);
		System.out.println(list2);
		for(Object o:list) {
			System.out.println(o);
		}
		ArrayList list4=new ArrayList(Arrays.asList(10,20,30,40,50));

	
		
		
	}
}
