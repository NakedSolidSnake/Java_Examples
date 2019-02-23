package application;
import entities.*;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		
		changeOjbectName(fido);
		System.out.println(fido.getName());
		fido.digHole();
		fido.setWeight(-1);
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
//		System.out.println("Doggy says: " + doggy.getSound());
//		System.out.println("Kitty says: " + kitty.getSound());
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		speakAnimal(doggy);
		speakAnimal(kitty);
	}
	
	public static void changeOjbectName(Dog fido)
	{
		fido.setName("Marcus");
	}
	
	public static void speakAnimal(Animal animal)
	{
		System.out.println("Animal says: "+ animal.getSound());
	}

}
