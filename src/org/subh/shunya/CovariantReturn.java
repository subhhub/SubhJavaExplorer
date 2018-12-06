package org.subh.shunya;

interface WildAnimal {
	/*public String willYouBite() {
		return "Yes";
	}*/
	
	public String willYouBite() ;
	
}

class Lion implements WildAnimal {
	public String whoAreYou() {
		return "Lion";
	}

	@Override
	public String willYouBite() {
		return "No I will hunt";
	}
}

class BengalTiger implements WildAnimal {
	public String whoAreYou() {
		return "Bengal Tiger";
	}

	@Override
	public String willYouBite() {
		return "No I will eat";
	}
}

class Zoo {
	WildAnimal getWildAnimal() {
		return new Lion();
	}
}

class AfricaZoo extends Zoo {
	@Override
	Lion getWildAnimal() {				//Covariant Return
		return new Lion();
	}
}

class IndiaZoo extends Zoo {
	@Override
	BengalTiger getWildAnimal() {				//Covariant Return
		return new BengalTiger();
	}
}

public class CovariantReturn {
	public static void main(String args[]) {
		AfricaZoo afZoo = new AfricaZoo();
		System.out.println(afZoo.getWildAnimal().whoAreYou());
		IndiaZoo inZoo = new IndiaZoo();
		System.out.println(inZoo.getWildAnimal().whoAreYou());
	}
}
