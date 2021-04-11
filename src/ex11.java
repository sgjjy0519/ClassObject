class Car11{
	String color;
	String gearType;
	int door;
	
	Car11(){
		
	}
	
	Car11(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}

public class ex11 {

	public static void main(String[] args) {
		Car11 c1 = new Car11();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car11 c2 = new Car11("white","auto",4);
		
		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
	}

}
