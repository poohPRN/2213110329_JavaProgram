import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int totalStudent = scan.nextInt();
		System.out.println();
		Student[] std = new Student[totalStudent]; 
		for(int i=0;i<std.length;i++) {
			std[i] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println("--------------------------------");
		}//end for()
		System.out.println();
		System.out.println("-----------------------------");
		for(Student STD : std) {
			if(STD.isPass()) {
				System.out.println(">>"+STD.getName()+" get grade "+findGrade(STD.getScore()));
			}
		}

	}
	
	public static String findGrade(int score) {
		if(score>=80 &&score<=100) {
			return "A";
		}else if (score>=75 &&score<=79) {
			return "B+";
		}else if (score>=70 &&score<=74) {
			return "B";
		}else if (score>=65 &&score<=69) {
			return "C+";
		}else if (score>=60 &&score<=64) {
			return "C";
		}else if (score>=55 &&score<=59) {
			return "D+";
		}else if (score>=50 &&score<=54) {
			return "D";
		}else if (score>=0 &&score<=49) {
			return "F";
		}
		return findGrade(score);
	}

}
