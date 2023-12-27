import javax.swing.*;
public class Lab706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {25,78,41,22,36,85,37};
		
		int indexNumb = Integer.parseInt(JOptionPane.showInputDialog(
				"Input index of array: "));
				
		while(checkIndex(nums,indexNumb)) 
		{
			indexNumb = Integer.parseInt(JOptionPane.showInputDialog(
					"Input index of array, again: "));
		}
		int currentValue = currentData(nums,indexNumb);
		JOptionPane.showInternalMessageDialog(null, "Current data ,nums["+indexNumb+"] is "+currentValue+
				((indexNumb-1<0)?"\nNo previous data":"\nPrevious data, nums["+(indexNumb-1)+"] is "+prevData(nums,indexNumb)+
				((indexNumb+1>nums.length-1)?"\nNo previous data":"\nNext data, nums["+(indexNumb+1)+"] is "+nextData(nums,indexNumb))));
	}//end main
	
	public static boolean checkIndex(int[]nums, int index) 
	{
		return ((index>=nums.length || index<0))?true:false;
	}
	
	public static int currentData(int[] nums , int index)
	{
		return nums[index];
	}
	
	public static int prevData(int[] nums,int index) 
	{
		return nums[index -1];
	}
	public static int nextData(int[]nums ,int index) 
	{
		return nums[index +1];
	}
}