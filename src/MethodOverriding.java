
class Animal
{
	void get()
	{
		System.out.println("Eats with mouth");
	}
}


class Monkey extends Animal
{
	void get()
	{  
		System.out.println("Eats with hands");
	}
}
class Cat extends Animal
{
	void get()
	{
		System.out.println("Eats with mouth");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Monkey m=new Monkey();
		m.get();
		Cat c= new Cat();
		c.get();
		}					
}
