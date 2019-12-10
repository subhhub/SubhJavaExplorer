package in.org.subh.learn.java;

public class DesignPatternFactoryAbstract {

	public static void main(String[] args) {
		
		
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle
		ShapeA shape1 = shapeFactory.getShape("CIRCLE");
		// call draw method of Shape Circle
		shape1.draw();

		// get an object of Shape Rectangle
		ShapeA shape2 = shapeFactory.getShape("RECTANGLE");
		// call draw method of Shape Rectangle
		shape2.draw();

		// get an object of Shape Square
		ShapeA shape3 = shapeFactory.getShape("SQUARE");
		// call draw method of Shape Square
		shape3.draw();

		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// get an object of Color Red
		Color color1 = colorFactory.getColor("RED");
		// call fill method of Red
		color1.fill();

		// get an object of Color Green
		Color color2 = colorFactory.getColor("Green");
		// call fill method of Green
		color2.fill();

		// get an object of Color Blue
		Color color3 = colorFactory.getColor("BLUE");
		// call fill method of Color Blue
		color3.fill();
	}

}

interface ShapeA {
	void draw();
}

class RectangleA implements ShapeA {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}

class SquareA implements ShapeA {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}

class CircleA implements ShapeA {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}

interface Color {
	void fill();
}

class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}

class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}

class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}

abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract ShapeA getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

	@Override
	public ShapeA getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new CircleA();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RectangleA();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new SquareA();
		}

		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}
}

class ColorFactory extends AbstractFactory {

	@Override
	public ShapeA getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}
}

class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}

		return null;
	}
}