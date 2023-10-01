package q2;

public class Lion {
	
	String name;
	boolean isHungry;
	int age;
	
	static int totalDeaths;
	
	static void printKillings() {
		
		System.out.println("Total killings by lions in jungle=" + totalDeaths);
		
	}
	
	void thinking() {
	
		
		if(isHungry == false) {
			System.out.println(name +" is sleeping");
		}
		else if(isHungry == true && age>12) {
			totalDeaths = totalDeaths + 2;
			System.out.println(name +"has eaten two animals");
		}
		else if(isHungry == true && age<=12 && age>=2) {
			totalDeaths++;
			System.out.println(name +" has eaten one animal");
			
		}
		else if(isHungry == true && age<2) {
			System.out.println(name +" is calling Mom");
		}
		
	}

}
