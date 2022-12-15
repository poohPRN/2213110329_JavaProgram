import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		int array = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		while(checkIndex(nums,array)) {
			array = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again : "));
		}//end of while
			JOptionPane.showMessageDialog(null,
					"Current data,nums"+"["+array +"]"+"is "+currentData(nums,array)
					+"\n"+(array!=0
					?"Previous data,nums"+"["+(array-1) +"]"+"is "+prevData(nums,array)
					: "No previous data")
					+"\n"+(array!=nums.length-1
					?"Previous data,nums"+"["+(array+1) +"]"+"is "+nextData(nums,array)
					: "No next data"));
	}//end of main

	public static boolean checkIndex(int[]nums,int index) {
		if(index <0||index > (nums.length-1)) {
			return true;
		}else {
			return false;
		}
	}//end of checkIndex
	
	public static int currentData(int[]nums,int index) {
		return nums[index];
	}//end of currentData
	
	public static int prevData(int[]nums,int index) {
		return nums[index-1];
	}//end of prevData
	
	public static int nextData(int[]nums,int index) {
		return nums[index+1];
	}//end of nextData

}
