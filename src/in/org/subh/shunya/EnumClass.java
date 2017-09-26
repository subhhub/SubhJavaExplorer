package in.org.subh.shunya;

class ConstantsWithoutEnums {
	
	private ConstantsWithoutEnums() {
	}
	
	public static final String NORTH = "NORTH";
	public static final String SOUTH = "SOUTH";
	public static final String EAST = "EAST";
	public static final String WEST = "WEST";
}

enum Directions {
	NORTH, SOUTH, EAST, WEST    //semicolon at the end of this statement is not mandatory
//	NORTH, SOUTH, EAST, WEST;				//Semicolon is optional
	// NORTH, SOUTH, EAST, WEST, WEST; 		//Compile Time Error : Duplicate Constants
}

enum EnumsMethod {
	A, B, C;			   //semocolon at the end of this statement is mandatory, because it has other members

	int i; // enums can have fields

	private EnumsMethod() {			//ONly private constructor is allowd
		// enums can have Constructor
	}
	void methodOfEnum() {
		// enums can have methods
	}
}
enum ErrorEngineObjectSeverityType {
    WARNING(1),
	ERROR(2),
	CRITICAL(3),
	FATAL(4),
	UNKNOWN(5);
	
	int value;
	private ErrorEngineObjectSeverityType(int value) {
		this.value = value;
	}
}

public class EnumClass {
	public static void main(String[] args) {
		System.out.println("=====================Traditional ENUM=================== ");
		System.out.println(ConstantsWithoutEnums.NORTH);
		System.out.println(ConstantsWithoutEnums.EAST);
		System.out.println(ConstantsWithoutEnums.SOUTH);
		System.out.println(ConstantsWithoutEnums.WEST);

		System.out.println("=====================ENUM=================== ");
		Directions d1 = Directions.EAST;
		System.out.println(d1);
		System.out.println(Directions.EAST);

		Directions d2 = Directions.NORTH;
		System.out.println(d2);
		
		System.out.println(ErrorEngineObjectSeverityType.UNKNOWN);
//		System.out.println(ErrorEngineObjectSeverityType.values());
		
		for (ErrorEngineObjectSeverityType cName : ErrorEngineObjectSeverityType.values()) {
			System.out.println("Error Severity Value: " + cName.value + " - Error Severity Name: " + cName);
		}
	}
}

/**
 * Every enum in java extends java.lang.Enum class. Enum class is an abstract class in java.lang package. 
 * As every enum extends Enum class, it should not extend any other class. Because, Multiple inheritance is not allowed in java. 
 * But enums can implement any number of interfaces.
 */
interface AnyInterface {
    abstract void methodOfInterface();
}
enum EnumInterface implements AnyInterface
{
    A, B, C;
 
    @Override
    public void methodOfInterface() {
        //MethodOfInterface is implemented
    }
}

/**
 * Enums can be declared inside a class. If declared inside a class, 
 * they are static by default and can be accessed directly by Class name.
 */
class ClassContainingEnum {
    enum enums {
        A, B, C
    }
}


/**
 * Enum constants can override generalized method defined in the enum body.
 */
enum EnumOverride {
    FIRST {
        @Override
        void commonMethod() {
            System.out.println("Common method Overridden in FIRST");
        }
    },
 
    SECOND {
        @Override
        void commonMethod() {
            System.out.println("Common method Overridden in SECOND");
        }
    },
 
    THIRD {
        @Override
        void commonMethod() {
            System.out.println("Common method Overridden in THIRD");
        }
    };
 
    void commonMethod() {
        System.out.println("Generalized method, Common to all constants");
    }
}


/**
 * Enum can have abstract method declared in it’s body provided each enum constants must implement it.
 */
enum EnumAbstract {
    FIRST {
        @Override
        void abstractMethod() {
            //Abstract Method Implemented
        }
    },
 
    SECOND {
        @Override
        void abstractMethod() {
            //Abstract Method Implemented
        }
    },
 
    THIRD {
        @Override
        void abstractMethod() {
            //Abstract Method Implemented
        }
    };
 
    abstract void abstractMethod();
}


/**
 * Enum Constants can have their own fields and method defined in their body, 
 * but these fields and methods are visible only within the constant body.
 */
enum EnumMethodDefinition {
    FIRST {
        int j = 10;   // Field of FIRST
 
        void methodOfFirst() {
            System.out.println(j);  //Field j can be used within the constant body
        }
 
        @Override
        void abstractMethod() {
            methodOfFirst();     //methodOfFirst() can be used within the constant body
        }
    },
 
    SECOND {
        int k = 20;   //Field of SECOND
 
        void methodOfSecond() {
            System.out.println(k);  //Field k can be used within the constant body
        }
 
        @Override
        void abstractMethod() {
            methodOfSecond();     //methodOfSecond() can be used within the constant body
        }
    };
 
    int i;   //this field is available in all constants
 
    abstract void abstractMethod();  //this method is available in all constants
}





