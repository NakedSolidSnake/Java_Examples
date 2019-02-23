package entities;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		Shape shape = null;;
		if(shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			shape = new RoundedRectangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE"))
		{
			shape = new RoundedSquare();
		}
		return shape;
	}
	
}
