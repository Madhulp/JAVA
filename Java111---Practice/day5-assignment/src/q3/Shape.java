package q3;

public class Shape {
	
	

	public void area(Circle circle) {
		
		double areaOfCircle = (3.14*circle.radius*circle.radius);
		System.out.println(areaOfCircle);		
	}
	
	public void area (Rectangle rectangle) {
		
		int areaOfRectangle = (rectangle.length * rectangle.breadth);
		System.out.println(areaOfRectangle);
		
	}
	
	public void area(Square square) {
		
		int areaOfSquare = square.side * square.side;
		System.out.println(areaOfSquare);
		
	}
}
