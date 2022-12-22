import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[3];
		for(int i=0;i<std.length;i++) {
			std[i] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.println("Input student score : ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.println("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
		}//end for()
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("-----------------------------");
		for(Student STD : std) {
			if(STD.isPass()) {
				System.out.println(">>"+STD.getName()+" ("+STD.getScore()+" )");
			}
		}

	}
	
	//public static String findGrade(int score) {
	//	if(score>=80 &&score<=100) {
	//		return "A";
	//	}else if (score>=75 &&score<=79) {
	//		return "B+";
	//	}
	//}

}
