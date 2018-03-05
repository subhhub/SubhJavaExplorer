package in.org.subh.shunya.ocjp6;
public class Question63 {
	public static void main(String[] args) {		//concept of string pooling
		Integer x = 400;
		Integer y = x;
		x++;
		System.out.println(x);
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = sb1;
		sb1 = sb1.append("5");
		System.out.println((x == y) + " " + (sb1 == sb2));
	}
}