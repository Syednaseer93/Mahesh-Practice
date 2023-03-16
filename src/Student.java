
public class Student {
	String name;
	int age;
	long phoneNumber;
	char gender;

	// 4 param custom constructor
	public Student(String name, int age, long phoneNumber, char gender) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}


