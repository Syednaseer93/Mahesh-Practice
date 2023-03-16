package HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapBasic {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(12, 12);
		map.put("John", 20);
		map.put(true, null);
		map.put(34.65, "Naseer");
		//Lamda expressions
		map.forEach((k,v) -> { System.out.println(k+"--->"+v);}  );



	}
}