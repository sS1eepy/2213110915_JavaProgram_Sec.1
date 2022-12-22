package week6;
import java.util.*;

public class TestPiggyBank {
	static Scanner scan = new Scanner (System.in);
	static PiggyBank pb = new PiggyBank();
	public static void main(String[]args) {
		inputSideOfPiggyBank();
	}
	public static void inputSideOfPiggyBank() {
		System.out.println("Money Total: "+pb.getTotal());
		System.out.print("Please define size of PiggyBank:");
		//int size = scan.nextInt();
		//pb.setPiggyBank(size);
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank: "+pb.getPiggyBank());
		inputCoin();
	}
	public static void inputCoin() {
		while (true) {
		System.out.println("\n=====================");
		System.out.println("Menu of PiggyBank");
		System.out.println("================");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] Exit");
		System.out.println("================");
		System.out.print("Please select choice [1-5] : ");
		int choice =scan.nextInt();
		if(choice==1) {
			System.out.print("Insert 1 baht money: ");
			pb.addOne(scan.nextInt());
			System.out.println("Money Total: "+pb.getTotal());
		}
		else if(choice==2) {
			System.out.print("Insert 2 baht money: ");
			pb.addTwo(scan.nextInt());
			System.out.println("Money Total: "+pb.getTotal());
		}
		else if(choice==3) {
			System.out.print("Insert 5 baht money: ");
			pb.addFive(scan.nextInt());
			System.out.println("Money Total: "+pb.getTotal());
		}
		else if(choice==4) {
			System.out.print("Insert 10 baht money: ");
			pb.addTen(scan.nextInt());
			System.out.println("Money Total: "+pb.getTotal());
		}
		else if(choice==5) {
			System.out.println("Bye Bye");
			break;
		}
	}
	}
}
