package practise;

public class Main {
	
	public static void printSomething(Printer p) {
		p.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsolePrinter cp = new ConsolePrinter();
		cp.print();
		
		Printer p = new ConsolePrinter();
		//p.print();
		
		Printer p2 = new FilePrinter();
		//p2.print();
		
		printSomething(p2);

	}

}
