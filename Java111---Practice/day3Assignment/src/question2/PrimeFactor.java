package question2;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeFactor(12);
	}
	
	public static void primeFactor(int n) {
		
		for(int i=2; i<n; i++) {
			while(n % i == 0) {
				System.out.println(i + " ");
				n = n/i;
			}
			if(n > 2) {
				System.out.println(n);
			}
			
		}
	}

}
