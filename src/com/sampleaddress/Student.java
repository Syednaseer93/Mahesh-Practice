package com.sampleaddress;

public class Student {
	String name;
	long phoneNo;
	Address a;

	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNo=" + phoneNo + ", a=" + a + "]";
	}

	public static void main(String[] args) {

		Student s=new Student();
		s.name="Alpha";
		s.phoneNo=97423289123L;
		s.a=new Address();
		s.a.no =20;
		s.a.street="2nd Main";
		s.a.city="Bangalore";
		s.a.pincode=560002;
		System.out.println(s);



	}


}
