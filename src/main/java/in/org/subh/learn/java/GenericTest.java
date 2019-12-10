package in.org.subh.learn.java;

import java.util.Map;

public class GenericTest {

	public static void main(String[] args) {
		System.out.println("Generic Test");
		
//		Rain<String> r = new Rain<String>();
//		r.rainType("Heavyly");
//		String f = r.tellMeRainType("Heavy");
		
		RainCal<Float> rc = new RainCal<Float>();
//		RainCal<?> rc = new RainCal<?>();
		rc.howMuchRain(20.5f, 50.6f);
		
		
		Map mp;
	}
}

class Rain<T>{		//Unbounded
	
	void rainType(T t){
		System.out.println("Raining "+t);
	}
	
	T tellMeRainType(T t){
		
		return t;
	}
}

//class RainCal<T implements Runnable>{		//Wrong 
//class RainCal<T super String>{		//Wrong
class RainCal<T>{		//Unbounded
	
	
	void howMuchRain(T t, T tb){
		
		System.out.println(" ok "+t+tb);
		
		return ;
	}
}

class RainCalTwo<X, Y>{		//Unbounded
	
	void howMuchRain(X t, Y tb){
		
		System.out.println(" ok "+t+tb);
		
		return ;
	}
}

class RainInter<T extends Runnable>{		//bounded interface
	
	
	void howMuchRain(T t, T tb){
		
		System.out.println(" ok "+t+tb);
		
		return ;
	}
}

class RainClsInter<T extends Number & Runnable>{		//bounded class and Interface together
	
	void howMuchRain(T t, T tb){
		
		System.out.println(" ok "+t+tb);
		
		return ;
	}
}

class RainInterInter<T extends Runnable & Comparable>{		//bounded Interface and Interface together
	
	void howMuchRain(T t, T tb){
		
		System.out.println(" ok "+t+tb);
		
		return ;
	}
}

class RainClsInterInter<T extends Number & Runnable & Comparable>{		//bounded class, Interface and Interface together
	
	void howMuchRain(T t, T tb){
		
		System.out.println(" ok "+t+tb);
		
		return ;
	}
}
