public class Kiosk {

	ChewingGum sell(Coin c) {
		System.out.println("Kiosk accepted coin and preparing a chewing gum object");
		ChewingGum cg = new ChewingGum();
		System.out.println("Returning chewing gum object");
		return cg;
	}

	public static void main(String[] args) {
		System.out.println("There is a kiosk machine present");
		Kiosk k = new Kiosk();
		
		System.out.println("There is a coin of value 5 rupees");
		Coin c = new Coin();
		c.value = 5;

		System.out.println("");
		ChewingGum gum = k.sell(c);
	
		
	}

}

