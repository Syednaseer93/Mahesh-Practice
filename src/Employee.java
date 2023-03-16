
public class Employee {
	String EmpName;
	int EmpNo;
	char EmpGender;
	


public Employee(String EmpName, int EmpNo,char EmpGender)
{
	this.EmpName=EmpName;
	this.EmpNo=EmpNo;
	this.EmpGender=EmpGender;
	
}



@Override
public String toString() {
	return "Employee [EmpNo=" + EmpNo + ", EmpGender=" + EmpGender + "]";
}

}