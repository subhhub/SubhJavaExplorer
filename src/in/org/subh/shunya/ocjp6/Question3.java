package in.org.subh.shunya.ocjp6;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//class MinMax<N extends Number>{
class MinMax<N extends Integer>{	
private N min, max;
	
	public N getMin() { return min; }
	public N getMax() { return max; }
	
	public void add(N added) {
		if (min == null || added.doubleValue() < min.doubleValue())
			min = added;
		if (max == null || added.doubleValue() > max.doubleValue())
			max = added;
	}
	
}
