package q1;

public class CheckWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		
		if(isSnowing || isRaining) {
			System.out.println("Lets stay at home...");
		}
		else if(temperature < 50) {
			System.out.println("Lets go out!");
		}

	}

}
