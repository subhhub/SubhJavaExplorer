package org.subh.shunya.ocjp6;

public class Question284 {

	
	
}

class Single{
	private static Single instance;
	public final Single getInstance(){
		if(instance==null)
			instance = create();
		return instance;
	}
	public Single(){
		
	}
	protected Single create(){
		return new Single();
	}
}
class SingleSub extends Single{
	
}