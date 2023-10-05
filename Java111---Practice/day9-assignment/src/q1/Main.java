package q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b1 = new Bird();
		b1.fly();
		
		Bird b = new Parrot();
		
		//downcast
		Parrot p = (Parrot) b;
		p.sing();
		
		
		
		

	}

}
