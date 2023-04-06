package question1;

public class CheckWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 40.0;
		
		if(isRaining || isSnowing) {
			System.out.println("Let's stay home");
		}
		else if(temperature < 50.0) {
			System.out.println("Lets's go out");
		}
	}

}
