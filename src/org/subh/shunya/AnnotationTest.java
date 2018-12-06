package org.subh.shunya;


/**
 * Marker Annotation : If it doesnot have any member
 * Single Value Annotation : If it has only one value
 * Multi Value Annotation : If it has multi values
 */
public class AnnotationTest {

	public static void main(String[] args) {
		
		System.out.println("Annotation Test");
	}
}

@interface SmartPhone {		//Marker

}
@interface SmartPhone2 {		//Single Value Annotation
	String os();
}
@interface SmartPhone3 {		//Multi Value Annotation
	String os();
	int version();
}
@interface SmartPhone4 {		//Multi Value Annotation with default values
	String os() default "Symbion";
	int version() default 0;
}

@SmartPhone									//Marker
//@SmartPhone2(os="Symbion")				//Single Value Annotation
//@SmartPhone3(os="Symbion", version=1)		//Multi Value Annotation
//@SmartPhone4								//Multi Value Annotation with default values
class NokiaSeris{
	
}

