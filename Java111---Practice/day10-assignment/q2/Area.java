package q2;

public class Area extends Shape{

	@Override
	int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	int squareArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	int circleArea(int radius) {
		Double pi = 3.14;
		// TODO Auto-generated method stub
		return (int)(pi*radius*radius);
	}

}
