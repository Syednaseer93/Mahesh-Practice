
public class StudentValidator {

	static void validateAge(Student s) {
		if (s.age > 18) {
			System.out.println("College student");
		} else {
			System.out.println("not a college student");
		}
	}

	static void compareStudents(Student s1, Student s2) {
		if (s1.age > s2.age) {
			System.out.println(s1);
		} else {
			System.out.println(s2);
		}
	}

	public static void main(String[] args) {
		Student student1 = new Student("Alpha", 24, 9832648263L, 'M');

		StudentValidator.validateAge(student1); //

		Student student2 = new Student("Beta", 15, 843658634L, 'F');

		StudentValidator.validateAge(student2);

		StudentValidator.compareStudents(student1, student2);
		
		
		Student s8 = new Student("Charlie",9, 99817268263L,'F');
		Student s9 = new Student("Mark", 19, 9346863498L, 'M');
		
		
		StudentValidator.compareStudents(s8, s9);

	}


}
