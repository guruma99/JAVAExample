package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("------------");
		
//		배열을 이용한 다형성(Polymorphism) 구현
		Animal[] animal = new Animal[5];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Dog();
		animal[3] = new Dog();
		animal[4] = new Cat();
		
		animalSound(animal);
	}
	
	public static void animalSound(Animal[] animal) {
		for(int i = 0; i < animal.length; i++) {
			animal[i].sound();
		}
	}
}
