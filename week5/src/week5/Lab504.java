package week5;
import java.util.*;

public class Lab504 {
	static String fullname;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		fullname=scan.nextLine();
		System.out.print(abbreviatName(fullname));
	}

	public static String abbreviatName(String fullname) {
		String[] split=fullname.split(" ");
		return split[1].toUpperCase().charAt(0)+"."+split[2].toUpperCase().charAt(0)+"."+split[0];
	}
}
