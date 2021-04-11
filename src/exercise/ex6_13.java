// 객체없이 메서드 호출 - static 메서드

package exercise;

public class ex6_13 {

	public static void main(String[] args) {
		Printer2.println(10);
		Printer2.println(true);
		Printer2.println(5.7);
		Printer2.println("홍길동");

	}

}

class Printer2{
	
	static void println(int x) {
		System.out.println(x);
	}
	
	static void println(boolean x1) {
		System.out.println(x1);
	}
	
	static void println(double x2) {
		System.out.println(x2);
	}
	
	static void println(String x3) {
		System.out.println(x3);
	}
}