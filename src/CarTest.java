
class Car{
	private String color;
	private int speed;
	
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
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
		Car mycar2 = new Car("����");
		Car mycar3 = new Car("�Ķ�",30);
		System.out.println("�����1�� ������ " + mycar1.getColor() + "�̸�, ����ӵ���" + mycar1.getSpeed() + "km�Դϴ�.");
		System.out.println("�����2�� ������ " + mycar2.getColor() + "�̸�, ����ӵ���" + mycar2.getSpeed() + "km�Դϴ�.");
		System.out.println("�����3�� ������ " + mycar3.getColor() + "�̸�, ����ӵ���" + mycar3.getSpeed() + "km�Դϴ�.");
		

	}

}
