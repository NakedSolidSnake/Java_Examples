package entities;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		Shape shape = null;
		if(shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			shape = new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE"))
		{
			shape = new Square();
		}
		return shape;
	}

}
