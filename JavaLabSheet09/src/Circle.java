
public class Circle {
	//the public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	//The private 2 Attributes
	private double radius;
	private String color;
	
	//Constructs a Circle with default radius and color
	//1st(default) Constructor
	public Circle() 
	{
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	//Constructs a Circle with the given radius and default color
	//2nd
	public Circle(double radius) 
	{
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//3rd
	public Circle(double radius,String color) 
	{
		this.radius = radius;
		this.color = color;
	}
	//Return the radius-the public getter for private attribute radius
	public double getRaduis() 
	{
		return this.radius;
	}
	//set the radius the public setter for private attribute radius
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	//Return the color-the public getter for private attribute color
	public String getColor() 
	{
		return this.color;
	}//set the color the public setter for private attribute color
	public void setColor(String color) 
	{
		this.color = color;
	}
	public String toString() 
	{
		return "Circle[radius="+radius+", color="+color+"]";
	}//รีเทร์น พื้นที่วงกลม
	public double getArea() 
	{
		return Math.PI * radius * radius;
		//Math.PI * Math.pow(radius,2)
	}
	//รีเทร์น เส้นรอบวง
	public double getCircumference() 
	{
		return 2.0*Math.PI*radius;
	}
}
