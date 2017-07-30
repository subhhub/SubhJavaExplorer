package in.org.subh.shunya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesignPatternFacadeClient {
	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		do {
			System.out.print("========= Mobile Shop ============ \n");
			System.out.print("            1. IPHONE.             \n");
			System.out.print("            2. SAMSUNG.            \n");
			System.out.print("            3. BLACKBERRY.         \n");
			System.out.print("            4. Exit.               \n");
			System.out.print("Enter your choice: ");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			ShopKeeper sk = new ShopKeeper();

			switch (choice) {
			case 1: {
				sk.iphoneSale();
			}
				break;
			case 2: {
				sk.samsungSale();
			}
				break;
			case 3: {
				sk.blackberrySale();
			}
				break;
			default: {
				System.out.println("Nothing You purchased");
			}
				return;
			}

		} while (choice != 4);
	}
}

interface MobileShop {
	public void modelNo();

	public void price();
}

class Iphone implements MobileShop {
	public void modelNo() {
		System.out.println(" Iphone 6 ");
	}

	public void price() {
		System.out.println(" Rs 65000.00 ");
	}
}

class Samsung implements MobileShop {
	public void modelNo() {
		System.out.println(" Samsung galaxy tab 3 ");
	}

	public void price() {
		System.out.println(" Rs 45000.00 ");
	}
}

class Blackberry implements MobileShop {
	public void modelNo() {
		System.out.println(" Blackberry Z10 ");
	}

	public void price() {
		System.out.println(" Rs 55000.00 ");
	}
}

class ShopKeeper {
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;

	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void blackberrySale() {
		blackberry.modelNo();
		blackberry.price();
	}
}