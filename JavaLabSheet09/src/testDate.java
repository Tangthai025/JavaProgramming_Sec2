
public class testDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(2023,2,8);
		System.out.println(d1);
		
		//Test Setter and Getter
		d1.setYear(2023);
		d1.setMonth(12);
		d1.setMonth(21);
		System.out.println("Year is: "+d1.getYear());
		System.out.println("Month is: "+d1.getMonth());
		System.out.println("Day is: "+d1.getDay());
		
		//Test setDate()
		d1.setDate(2024, 1, 2);
		System.out.println("The date of object: "+d1);
		}

}
