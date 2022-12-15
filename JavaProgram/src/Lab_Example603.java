import java.util.*;
public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] fullNum = new int [5];
		for(int i=0;i<fullNum.length;i++) {
			System.out.print("Input number "+(i+1)+" :");
			fullNum[i]= scan.nextInt();
			
		}
		System.out.println();
		System.out.println("Summation of positive number is"+ sumOfPos(fullNum));
	}//end of main
	
	public static int sumOfPos(int[] num) {
		int sum = 0;
		for(int _num:num) {
			sum+=_num;
		}
		return sum;
	}//end of sumOfPos

}
