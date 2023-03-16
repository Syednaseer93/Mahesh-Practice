package HashMapDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String,Long> StudentData=new HashMap<>();
		StudentData.put("John", 68876668887L);
		StudentData.put("Sam", 8476478475L);
		StudentData.put("Lee", 74887548837L);
		StudentData.put("Love", 75839398574L);
		StudentData.put("Scott", 93847584995L);

		System.out.println("\n-----------Keys are-------------------");
		StudentData.forEach((k,v)-> {System.out.println(k+" ");});

		System.out.println("\n-----------Values are-----------------");
		StudentData.forEach((k,v)-> {System.out.println(v+" ");});

		System.out.println("\n-----------Keys and Values------------");
		StudentData.forEach((k,v)-> {System.out.println(k+"--->"+v);});


		System.out.println("\n---------for each by me---------------");

		for(String k:StudentData.keySet()) {
			System.out.println(k+"--->"+StudentData.get(k));
		}
	}	
}
