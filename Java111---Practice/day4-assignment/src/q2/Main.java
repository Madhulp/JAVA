package q2;

public class Main {
	
	public static void main(String[] args) {
		
		Lion lion1 = new Lion();
		lion1.name = "Lion1";
		lion1.age = 14;
		lion1.isHungry = true;
		lion1.thinking();
		
		Lion lion2 = new Lion();
		lion1.name = "Lion2";
		lion1.age = 12;
		lion1.isHungry = true;
		lion1.thinking();
		
		Lion lion3 = new Lion();
		lion1.name = "Lion3";
		lion1.age = 1;
		lion1.isHungry = true;
		lion1.thinking();
		
		Lion.printKillings();
		
	
		
	}

}
