package week5;
import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		Scanner scan = new Scanner (System.in);
		String id = "";
		int subject = 0 ;
		System.out.print("Enter Student Id : ");
		id = scan.nextLine();
		System.out.print("Enter Subject ID : ");
		subject = Integer.parseInt(scan.nextLine());
		while((id.length()>9||id.length()<11)&&(subject<=0000000||subject>10000000)) {
			System.out.print("Enter Student Id : ");
			id = scan.nextLine();
			System.out.print("Enter Subject ID : ");
			subject = Integer.parseInt(scan.nextLine());
		}
	}
	public static isLength() {
		
	}
	public static isITStudent() {
		
	}
	public static isITSubject() {
		
	}
	public static displayData() {
		
	}
	
}
