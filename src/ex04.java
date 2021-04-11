
public class ex04 {

	public static void main(String[] args) {
		
		Mymath my = new Mymath();
		
		long result1 = my.add(5l, 5l);
		long result2 = my.subtract(8l, 10l);
		long result3 = my.multiply(9l, 12l);
		long result4 = my.divide(20l, 5l);
		long max = my.max(4, 8);
		my.printGugudan(6);
		
		System.out.println("my.max(4, 8) = "+ max);
		System.out.println("my.add(5l, 5l) = "+result1);
		System.out.println("my.subtract(8l, 10l) = "+result2);
		System.out.println("my.multiply(9l, 12l) = "+result3);
		System.out.println("my.divide(20l, 5l) = "+result4);

	}

}

class Mymath{
	
	void printGugudan(int dan) {
		
		if(!(2<=dan && dan<=9))
			return;
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
	
	long max(long a, long b) {
		if(a > b) {
			return a;
		}else
			return b;
	}
	
	
	
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	
	long subtract(long a, long b) {
		return a-b;
	}
	
	long multiply(long a, long b) {
		return a*b;
	}
	
	long divide(long a, long b) {
		return a/b;
	}
}
