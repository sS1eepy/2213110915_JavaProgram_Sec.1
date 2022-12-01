package week4;
import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		if(!fullName.contains(" ")) {
			System.out.print("Incorrect Name");
			return;
		}
		int space = fullName.indexOf(" ");
		String firstName = fullName.substring(0,space).toUpperCase();
		String lastName = fullName.substring(space,fullName.length()).toLowerCase();
		System.out.println("First Name : "+firstName);
		System.out.print("Last Name : "+lastName);
		

	}

}
