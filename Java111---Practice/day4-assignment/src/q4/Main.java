package q4;

public class Main {
	
	void printNumber(int num) {
		
		if(num<0) {
			System.out.println("Error");
		}
		else if(num%2==0){
			
			System.out.println((num/10+1) * 10);
		}
		else if(num%2!=0){
			System.out.println(num);
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Main main = new Main();
		 main.printNumber(24);
		 

	}

}
