package in.org.subh.learn.java;

public class CollatzLongestSequence {

	static int v = 0;
	public static int collatz(int n) {
		v = v+1;
        System.out.print(n + " ");
        if (n == 1) 
        	return v;
        else if (n % 2 == 0) 	
        	collatz(n / 2);
        else 
        	collatz(3*n + 1);
        
        return v;
    }
	
	static int longestSequence(int N){
		int longSeq = 0;
		int fNum = 0;
		for (int i = 1; i <= N; i++) {
			int cn = collatz(i);
			System.out.println("cn "+cn);
			
			if(longSeq<v){
				longSeq = v;
				fNum = i;	
			}
			
			v = 0;
		}
		return fNum;
	}

    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        collatz(3);
//        System.out.println();
    	
    	int ls = longestSequence(9);
    	System.out.println("long Seq "+ls);
    }


}
