
public class ex01 {

	public static void main(String[] args) {
		Tv t = new Tv(); // Tv클래스 타입의 t변수 선언, Tv인스턴스를 생성 후 생성된 인스턴스의 주소를 t에 저장

		t.color = "검정색";
		t.channel = 2;
		t.volume = 10;

		t.channelUp();
		t.volumeDown();

		System.out.println("우리집 Tv의 색은" + t.color + "이고, 현재 채널은" + t.channel + "번, 현재 볼륨은" + t.volume + "이다.");
	}

}

class Tv {
	// Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	int volume;

	// Tv의 기능(메서드)
	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

	void volumeUp() {
		++volume;
	}

	void volumeDown() {
		--volume;
	}
}
