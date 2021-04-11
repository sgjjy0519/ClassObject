//메서드 오버로딩, void는 리턴값이 없어도된다.

package exercise;

public class ex6_12 {

	public static void main(String[] args) {
		Printer pr = new Printer();
		
		pr.println(10);
		pr.println(true);
		pr.println(5.7);
		pr.println("홍길동");

	}

}

class Printer{
	
	void println(int x) {
		System.out.println(x);
	}
	
	void println(boolean x1) {
		System.out.println(x1);
	}
	
	void println(double x2) {
		System.out.println(x2);
	}
	
	void println(String x3) {
		System.out.println(x3);
	}
}
