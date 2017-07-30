package in.org.subh.shunya;

public class CouplingAndCohesion {

	public static void main(String[] args) {

		System.out.println("Coupling");
	}
}

class ShoppingCartEntry{
	int price;
	int quantity;
	
	float getTotalPrice(){
		return price * quantity;
	}
}
class ShoppingCart{
	ShoppingCartEntry items;
}
class Order{
	ShoppingCart sc;
	
	/*void getTotalPrice(){					//tghtly coupled
		int tt = sc.items.price * sc.items.quantity;
	}*/
	
	void getTotalPrice(){					//lously couple
		float tt = sc.items.getTotalPrice();
	}
}