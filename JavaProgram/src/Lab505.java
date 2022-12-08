import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		inputStudent();
		
	}
	
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		String studentID = scan.nextLine();
		System.out.print("Enter Subject Id: ");
		String subjectID = scan.nextLine();
		while(isLength(studentID,subjectID)) {
			System.out.print("Enter Student Id: ");
			studentID = scan.nextLine();
			System.out.print("Enter Subject Id: ");
			subjectID = scan.nextLine();
		}//end while Loop
		isITStudent(studentID);
		isITSubject(subjectID);
		displayData(isITStudent(studentID),isITSubject(subjectID));
	}
	
	public static boolean isLength(String stid,String sjid) {
		if(stid.length()==10 && sjid.length()==7) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isITStudent(String stid) {
		return true;
	}
	
	public static boolean isITSubject(String sjid) {
		return true;
	}
	
	public static void displayData(String ITStudent,String ITSubject) {
		
	}
}
