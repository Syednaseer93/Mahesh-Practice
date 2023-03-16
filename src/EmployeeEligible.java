
public class EmployeeEligible {
	static void eligible(Employee s)
	{
		if(s.EmpNo==100 && s.EmpGender=='M')
		{
			System.out.println("Job Approved");
		}
		else
		{
			System.out.println("Job Rejected");
		}
	}
	 static void genderCheck(Employee s)
	 {
		 if(s.EmpName=="Malini"||s.EmpName=="Hema")
		 {
			 System.out.println("Female Employee");
		 }
		 else
		 {
			 System.out.println("Male Employee");
		 }
				 }
		public static void main(String[] args) {
			Employee s1=new Employee("Syed",100,'M');
			EmployeeEligible.eligible(s1);
			Employee s2=new Employee("Malini",102,'F');
			EmployeeEligible.genderCheck(s2);
			
			
			

	}

}
