
public class PersonalInfo {
	private Person name;//ref from class Person.java
	private Date bDay; //ref from class Date.java
	//declare 1 private attribute
	private int personID;
	
	PersonalInfo()
	{
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	PersonalInfo(String first,String last,int month,int day,int year,int ID)
	{
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}
	//Method to set the personal information
	//call set method from class Person
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) 
	{
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = 0;
	}
	public String toString() 
	{
		return "Name: "+name.toString() +"\n"+
	"Date of birth: "+bDay.toString()+"\n"+"Personal ID: "+personID;
	}
}
