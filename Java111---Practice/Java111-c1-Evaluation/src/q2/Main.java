package q2;

public class Main {

	static void printMonth(String month) {
		switch (month) {
		case "JAN" : {	
			System.out.println("this is the first month of the year January");
			break;
		}
		case "FEB" : {
			System.out.println("this is the second month of the year February");
			break;
		}
		case "MAR" : {
			System.out.println("this is the third month of the year March");
			break;
		}
		case "APR" : {
			System.out.println("this is the fourth month of the year April");
			break;
		}
		case "MAY" : {
			System.out.println("this is the fifth month of the year MAy");
			break;
		}
		case "JUN" : {
			System.out.println("this is the sixth month of the year JUne");
			break;
		}
		case "JUL" : {
			System.out.println("this is the seventh month of the year July");
			break;
		}
		case "AUG" : {
			System.out.println("this is the eight month of the year August");
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}
	}
	
	public static void main(String[] args) {
		String month = "JUL";
		printMonth(month);
	}
	

	

}
