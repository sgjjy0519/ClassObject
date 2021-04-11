package exercise;
class MyPoint{
	int x;
	int y;
	
	MyPoint(int x,int y){
		this.x = x; // 1
		this.y = y; // 2
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	}
}
	
public class ex6_04 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		
		System.out.println(p.getDistance(2, 2));

	}
}
