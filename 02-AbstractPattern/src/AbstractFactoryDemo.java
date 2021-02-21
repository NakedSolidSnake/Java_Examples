
public class AbstractFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape s1 = shapeFactory.getShape("CIRCLE");
		s1.draw();
		
		Shape s2 = shapeFactory.getShape("RECTANGLE");
		s2.draw();
		
		Shape s3 = shapeFactory.getShape("SQUARE");
		s3.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color c1 = colorFactory.getColor("RED");
		c1.fill();
		
		Color c2 = colorFactory.getColor("GREEN");
		c2.fill();
		
		Color c3 = colorFactory.getColor("BLUE");
		c3.fill();
	}
}
