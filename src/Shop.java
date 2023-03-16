
public class Shop {
	
 Fruit sell(int option)
 {
	 if(option==1)
	 {
		 return new Apple();
	 }
	 else
	 {
		 return new Mango();
	 }
	 
 }
 public static void main(String[] args) {
	 Shop s=new Shop();
	Fruit f=s.sell(1);// indirectly this    fruit f =new object();
	f.clean();
//	Apple a=new Apple();
	//a.prepareMilkShake();
	Apple a=(Apple)f;// down casting
	a.prepareMilkShake();
	
}
}
