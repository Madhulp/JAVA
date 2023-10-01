package question2;

public class CharacterAtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterAtoZ a = new CharacterAtoZ();
		a.Characterss('n');

	}
	
	public void Characterss(char ch) {
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowels");
		}
		else {
			System.out.println("Consonant");
		}
		
		
	}

}
