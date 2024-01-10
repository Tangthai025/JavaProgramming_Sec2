//Class ต้นแบบ
public class Circle {
	//attribute
	public double radius;
	
	//methods  this is non static method
	public double getRadius() 
	{
		return radius;
	}
	public double getArea() 
	{
		return Math.PI * radius * radius;
	}
}
