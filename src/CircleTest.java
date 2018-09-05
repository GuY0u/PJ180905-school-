
class Circle{
	int radius; //반지름
	String color; //색상
	
	double calArea() {
		return 3.14 * radius * radius;
	}
	
}


public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		
		obj.radius = 100;
		obj.color = "blue";
		double area = obj.calArea();
		
		System.out.println("원의 면적 = " + area);
		System.out.println("원의 색상 = " + obj.color);

	}

}
