package q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animal = new Animal[3];
		
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Tiger();
		
		for(Animal i: animal) {
			i.eat();
			i.walk();
			i.makeNoise();
			System.out.println();
		}
		

	}

}
