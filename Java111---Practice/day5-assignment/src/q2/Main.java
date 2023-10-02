package q2;

public class Main {
	
	void Alphabet(char c) {
		
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("Vowels");
		}
		else {
			System.out.println("Consonant");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m = new Main();
		m.Alphabet('i');

	}

}
