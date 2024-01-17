
public class TestCircle {

	public static void main(String[] args) {
		// Test all constructors and toString()
		Circle c1 = new Circle(1.1,"blue");//call 3rd
		System.out.println(c1);
		
		Circle c2 = new Circle(2.2);//call 2nd
		System.out.println(c2);
		
		Circle c3 = new Circle();//call 1st
		System.out.println(c3);
		
		// Test getter and setter
		c1.setRadius(3.3);
		c1.setColor("Green");
		System.out.println(c1.getRaduis());
		System.out.println(c1.getColor());
		
		//Test getArea() and getCircumference()
		System.out.printf("The area is: %.2f%n",c1.getArea());
		System.out.printf("The Circumference is: %.3f",c1.getCircumference());
	}

}
