package q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the laptop purpose (gaming/business}");
		String laptopPurpose = sc.nextLine();
		sc.close();
		
		Laptop l = getLaptop(laptopPurpose);
		if(l != null) {
			l.displayDetails();
		}
		else {
			System.out.println("Invalid laptop purpose. ");
		}

	}
	
	public static Laptop getLaptop(String laptopPurpose) {
		if(laptopPurpose.equalsIgnoreCase("gaming")) {
			Laptop gamingLaptop = new Laptop();
			gamingLaptop.setColor("Black");
			gamingLaptop.setCompanyName("Radeon");
			gamingLaptop.setName("Acer");
			gamingLaptop.setPurpose("gaming");
			
			CPU gamingCpu = new CPU();
			gamingCpu.setManufacturer("Radeon");
			gamingCpu.setProdessor("Ryzen 9 5800H" );
			gamingCpu.setClockSpeed(3200.0);
			
			GraphicCard gamingGraphicCard = new GraphicCard();
			gamingGraphicCard.setManifacturer("Radeon");
			gamingGraphicCard.setSeries("RTX 3060 Ti");
			gamingGraphicCard.setCapacity("16GB");
			
			gamingLaptop.setCpu(gamingCpu);
			gamingLaptop.setGraphicCard(gamingGraphicCard);
			return gamingLaptop;
		}
		else if(laptopPurpose.equalsIgnoreCase("business")) {
			Laptop busiLaptop = new Laptop();
			busiLaptop.setColor("Rose Gold");
			busiLaptop.setCompanyName("HP");
			busiLaptop.setName("Aero 13");
			busiLaptop.setPurpose("business");
			
			CPU busiCpu = new CPU();
			busiCpu.setManufacturer("Intel");
			busiCpu.setProdessor("i5 102010U");
			busiCpu.setClockSpeed(1800.0);
			
			GraphicCard busiGraphic = new GraphicCard();
			busiGraphic.setManifacturer("Intel");
			busiGraphic.setSeries("Iris Xe");
			busiGraphic.setCapacity("Integrated");
			
			busiLaptop.setCpu(busiCpu);
			busiLaptop.setGraphicCard(busiGraphic);
			return busiLaptop;
		}
		return null;
	}

}
