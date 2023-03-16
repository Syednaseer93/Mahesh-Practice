
public class Student_Array {

	String name;
	int age;
	long phoneNo;

	public Student_Array(String name,int age,long phoneNo)
	{
		this.name=name;
		this.age=age;
		this.phoneNo=phoneNo;
	}

	public static void main(String[] args) {
		Student_Array s1=new Student_Array("Johnny",12,9631234422L);
		Student_Array s2=new Student_Array("Sins",14,9285388347L);

		//Creating a students Array of an Student_Array[] type which contains 2 objects as Array elements
		Student_Array[] students= {s1,s2};

		System.out.println(students[0]);
		System.out.println(students[1]);

		System.out.println(students[0].name);// to print specific elements from objects
		System.out.println(students[1].name);
	}
	@Override
	public String toString() {
		return "Student_Array [name=" + name + ", age=" + age + ", phoneNo=" + phoneNo + "]";
	}

}





