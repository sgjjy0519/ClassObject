class MyMath2{
	long a, b;
	
	long add() { return a+b;}
	long subtract() { return a-b;}
	long multiply() { return a*b;}
	long divide() { return a/b;}
	//인스턴스 메서드
	
	static long add(long a, long b) { return a+b;}
	static long subtract(long a, long b) { return a-b;}
	static long multiply(long a, long b) { return a*b;}
	static long divide(long a, long b) { return a/b;}
	//클래스메서드
}

public class ex08 {

	public static void main(String[] args) {
		//클래스 메서드 호출 - 객체생성없이 호출가능
		System.out.println(MyMath2.add(5, 5));
		System.out.println(MyMath2.subtract(5, 5));
		System.out.println(MyMath2.multiply(5, 5));
		System.out.println(MyMath2.divide(5, 5));
		
		MyMath2 mm = new MyMath2();
		mm.a = 10;
		mm.b = 10;
		//인스턴스 메서드 호출
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());

	}

}
