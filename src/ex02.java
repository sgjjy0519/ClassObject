
public class ex02 {

	public static void main(String[] args) {
		Car car = new Car(); 
		Car car2 = new Car();

		car.name = "소나타";
		car.color = "RedWine";
		car.capacity = 5;
		car.speed = 50;
		car.price = 14000000;

		car.speedUp();

		System.out.println("현재 타고있는 차량은" + car.name + "이고, 색상은" + car.color + "이고,\n수용인원은" + car.capacity + "이며 현재 속도는"
				+ car.speed + "km/h 이고 " + car.name + "의 가격은" + car.price + "이다.");
		
		System.out.println();
		
		car2.name = "그랜져";
		car2.color = "BlackWine";
		car2.capacity = 6;
		car2.speed = 70;
		car2.price = 2000000;
		
		car2.speedDown();
		car2.speedDown();
		car2.speedDown();
		car2.speedDown();
		System.out.println("현재 타고있는 차량은" + car2.name + "이고, 색상은" + car2.color + "이고,\n수용인원은" + car2.capacity + "이며 현재 속도는"
				+ car2.speed + "km/h 이고 " + car2.name + "의 가격은" + car2.price + "이다.");
	}

}

class Car {
	String name;
	String color;
	int capacity;
	int speed;
	int price;

	void speedUp() {
		speed += 10;
	}

	void speedDown() {
		speed -= 10;
	}

}

