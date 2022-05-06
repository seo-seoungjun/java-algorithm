package week11;


public class TestClass2{
	public static void main(String[] args) {
		GeometricObjectComparable[] objects = {new Square(2), new Circle(5), new Square(5), new Rectangle(3,4), new Square(4.5)};
		
		for(int i=0; i<objects.length; i++) {
			System.out.println("Area is "+ objects[i].getArea());
			if(objects[i] instanceof Square) {
				Square s = (Square) objects[i];
				s.howToColor();
			}
		}
	}
}
