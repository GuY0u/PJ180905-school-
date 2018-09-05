
class Car{
	private String color;
	private int speed;
	
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color; //클래스매개변수랑 메소드의 매개변수가 이름이 똑같다 그래서 나를 지정해주는 this를 사용한다.
	}
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
	
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar1 = new Car();
		Car mycar2 = new Car("빨강");
		Car mycar3 = new Car("파랑",30);
		System.out.println("사용자1의 색상은 " + mycar1.getColor() + "이며, 현재속도는" + mycar1.getSpeed() + "km입니다.");
		System.out.println("사용자2의 색상은 " + mycar2.getColor() + "이며, 현재속도는" + mycar2.getSpeed() + "km입니다.");
		System.out.println("사용자3의 색상은 " + mycar3.getColor() + "이며, 현재속도는" + mycar3.getSpeed() + "km입니다.");
		

	}

}
