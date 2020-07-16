package in.org.subh.learn.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kewats
 * 
 * As you can see, a for loop is really good in this case; hence, without proper analysis, don't replace for loop with streams.  
 * Here we can see the good performance of parallel Streams over normal Streams.
 * 
 * Stream is meant for better performance, but it's not always effective, and we need to use it wisely.
 *
 */
public class C8StreamPerformanceTest {
	
	static List<Integer> myList = new ArrayList<>();

	public static void main(String[] args) {
		
		for (int i = 0; i < 5000000; i++)
			myList.add(i);
		
		int result = 0;
		
		long loopStartTime = System.currentTimeMillis();
		for (int i : myList) {
			if (i % 2 == 0)
				result += i;
		}
		long loopEndTime = System.currentTimeMillis();
		
		System.out.println(result);
		System.out.println("Loop total Time = " + (loopEndTime - loopStartTime));
		
		long streamStartTime = System.currentTimeMillis();
		System.out.println(myList.stream().filter(value -> value % 2 == 0).mapToInt(Integer::intValue).sum());
		long streamEndTime = System.currentTimeMillis();
		
		System.out.println("Stream total Time = " + (streamEndTime - streamStartTime));
		
		long parallelStreamStartTime = System.currentTimeMillis();
		System.out.println(myList.parallelStream().filter(value -> value % 2 == 0).mapToInt(Integer::intValue).sum());
		long parallelStreamEndTime = System.currentTimeMillis();
		
		System.out.println("Parallel Stream total Time = " + (parallelStreamEndTime - parallelStreamStartTime));
	}
}
