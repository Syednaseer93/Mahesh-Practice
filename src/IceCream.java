
public class IceCream { //EXAMPLE FOR CONSTRCUTOR CHAINING

	String flavour;
	char size;
	boolean extraNuts;

	IceCream(String flavour, char size, boolean extraNuts)
	{
		this.flavour=flavour;
		this.size=size;
		this.extraNuts=extraNuts;
	}
	IceCream(String flavour, char size)
	{
		this(flavour,size,false);
	}

	IceCream(String flavour)
	{
		this(flavour,'\u0000',false);
	}
	
	@Override
	public String toString() {
		return "IceCream [flavour=" + flavour + ", size=" + size + ", extraNuts=" + extraNuts + "]";
	}
	public static void main(String[] args) {
		IceCream ice=new IceCream("NaSEER");
		System.out.println(ice);
	}

}
