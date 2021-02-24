
public class MementoDemo {	
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State #1");
		originator.setState("State #2");
		
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #4");
		
		System.out.println("Current State: " + originator.getState());
		
		for (int i = 0; i < careTaker.getMementoItemsSaved(); i++) {
			originator.getStateFromMemento(careTaker.get(i));
			System.out.println(i + "º saved State: " + originator.getState());
		}
		
	}
}
