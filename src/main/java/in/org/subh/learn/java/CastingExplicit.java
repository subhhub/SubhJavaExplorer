package in.org.subh.learn.java;

/**
 * @author esubkew
 * 
 * Explicit Casting in Java / Narrowing
 * 
 * When you are assigning a larger type to a smaller type, then Explicit Casting is required
 *
 */
public class CastingExplicit {

	public static void main(String args[]) {
		
		double d = 75.0;
		// Explicit casting is needed for below conversion
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;

		System.out.println("double value : " + d);
		System.out.println("float value : " + f);
		System.out.println("long value : " + l);
		System.out.println("int value : " + i);
		System.out.println("short value : " + s);
		System.out.println("byte value : " + b);
	}

}
