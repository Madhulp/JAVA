package q1;

public class Ola {

	public Car bookCar(int numberOfPassengers, int numberOfKms) {
		if(numberOfPassengers <= 3) {
			return new HatchBack();
		}
		else
		return new Sedan();
		
	}
	
	public int calculateBill(Car car) {
		
	
		return 0;
		
	}
}
