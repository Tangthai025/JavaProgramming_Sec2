
public class testCircleA {
	
	public static void main(String[] args) {
		CircleA c1 = new CircleA();
		CircleA c2 = new CircleA();
		CircleA c3 = new CircleA();
		
		c1.setRadius(2.0);
		c1.setColor("Blue");
		
		c2.setRadius(2.0);
		c2.setColor("red");
		
		c3.setRadius(1.0);
		c3.setColor("red");
		
		System.out.println("Circle 1 area = "+c1.getArea()+", and Color is "+c1.getColor());
		System.out.println("Circle 2 area = "+c2.getArea()+", and Color is "+c2.getColor());
		System.out.println("Circle 3 area = "+c3.getArea());
		
		
	}

}
