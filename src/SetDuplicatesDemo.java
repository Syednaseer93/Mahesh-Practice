import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class SetDuplicatesDemo {
	int orderId;
	int noOfItems;
	double totalCost;


	public SetDuplicatesDemo(int orderId, int noOfItems, double totalCost) {
		this.orderId = orderId;
		this.noOfItems = noOfItems;
		this.totalCost = totalCost;
	}
	@Override
	public String toString() {
		return "SetDuplicatesDemo [orderId=" + orderId + ", noOfItems=" + noOfItems + ", totalCost=" + totalCost + "\n]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(orderId);
	}
	
	//ALT +SHFT+S+H . to create hashcode and equals method. which is responsible for not allowing duplicates
	//inside a customer SET created with own objects.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;	
		if (getClass() != obj.getClass())
			return false;
		SetDuplicatesDemo other = (SetDuplicatesDemo) obj;
		return orderId == other.orderId;
	}
	
	public static void main(String[] args) {
		SetDuplicatesDemo so1=new SetDuplicatesDemo(10, 4, 450.56);
		SetDuplicatesDemo so2=new SetDuplicatesDemo(11, 5, 452.65);
		SetDuplicatesDemo so3=new SetDuplicatesDemo(12, 6, 500);
		SetDuplicatesDemo so4=new SetDuplicatesDemo(13, 7, 340.76);
		SetDuplicatesDemo so5=new SetDuplicatesDemo(14, 8, 670.90);
		SetDuplicatesDemo so6=new SetDuplicatesDemo(14, 6, 563.90);
		HashSet <SetDuplicatesDemo> hs=new HashSet<>(Arrays.asList(so1,so2,so3,so4,so5,so6));
		System.out.println(hs);
	}
}                                                                                                                                                   
