package week6;
import java.util.*;

public class TestStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int _student = scan.nextInt();
		System.out.println();
		Student[] std= new Student[_student];
		for(int i = 0;i<std.length;i++) {
			std[i]=new Student();
			//System.out.println("INPUT INFORMATION OF STUDENT : "+(i+1));
			//System.out.println("-----------------------------------------");
			System.out.print("Input student name: ");
			//std[i]=scan.next();
			std[i].setName(scan.next());
			System.out.print("Input student score: ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score,again: ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println("--------------------------------------");
			//System.out.println();
		}
		//System.out.println("--------------------------------------");
		for(Student stds : std) {
			if(stds.isPass()) {
				System.out.println(">> "+stds.getName()+ " get grade "+ stds.findGrade());
			}
		}
		

	}

}
