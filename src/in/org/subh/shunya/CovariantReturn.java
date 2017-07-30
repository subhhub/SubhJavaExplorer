package in.org.subh.shunya;

class WildAnimal {
	public String willYouBite() {
		return "Yes";
	}
}

class Lion extends WildAnimal {
	public String whoAreYou() {
		return "Lion";
	}
}

class BengalTiger extends WildAnimal {
	public String whoAreYou() {
		return "Bengal Tiger";
	}
}

class Zoo {
	WildAnimal getWildAnimal() {
		return new WildAnimal();
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
