
public class Example701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12,50,93,45,75,52,80};
		for (int i = 0;i<nums.length;i++) 
		{
			System.out.println("nums["+i+"] = "+nums[i]);
		}
		System.out.println("using foreach to display value from array nums");
		int j = 0;
		for(int x:nums) {
			System.out.println("nums ["+j+"] = "+x);
			j++;
			}
		printArray(nums);//method no return
	}//end of main()
	public static void printArray(int[] num) 
	{
		System.out.println("using metthod to display value from array nums");
		for (int i = 0;i<num.length;i++) 
		{
			System.out.println("nums["+i+"] = "+num[i]);
		}
	}//end of printArray()

}
