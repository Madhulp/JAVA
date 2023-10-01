package question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes shape = new Shapes();
		
		shape.area(new Circle());
		shape.area(new Rectangle());
		shape.area(new Square());

	}
	
//	with the help of this explain static polymorphism(Compile time polymorphism)?
	//Ans: 
		
		//jb method signature same ho...but parameter different ho to..compile time polymorphism hota hai.
		
		//bt agr same method name aur same parameter with same datatype hua to...error ayega
		
		
			

}
