import javax.swing.JOptionPane;

public class Lab_Example602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static String deName;
	static boolean deptWasFound = false;
	public static void main(String[] args) {
		inputName();

	}

	public static void  inputName() {
		deName = JOptionPane.showInputDialog("Enter a department name");
		
		for(int i =0; i<deptName.length;i++) {
			if(deName.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}//end of for
			
			if(deptWasFound) {
				JOptionPane.showMessageDialog(null, deName + "was found in the list");
			}else {
				JOptionPane.showMessageDialog(null, deName + "was not found in the list");
			}
		}
	}
}
