
public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		
		System.out.println(object);
		System.out.println(object2);
		object.showMessage();
	}
}

