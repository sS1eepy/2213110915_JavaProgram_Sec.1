package week4;
import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		int index = 0;
		String format = sentence.replace("."," ");
		System.out.println();
		for(int i=0;i<sentence.length();i++) {
			if (format.charAt(i)==' ') {
			System.out.println(format.substring(index,i));
			index=i+1;
			}
		}

	}

}
