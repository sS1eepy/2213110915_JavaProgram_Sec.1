import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		System.out.print("Input movie id\t  : ");
		String movieId = scan.nextLine();
		System.out.print("Input movie name  : ");
		String movieName = scan.nextLine();
		System.out.println();

		System.out.print("Input director name\t: ");
		String diName = scan.nextLine();
		System.out.print("Input director e-mail\t: ");
		String diEmail = scan.nextLine();
		System.out.print("Input director gender\t: ");
		String diGender = scan.nextLine();

		while (!diGender.equalsIgnoreCase("m") && !diGender.equalsIgnoreCase("f")) {
			System.out.print("Input director gender, again\t: ");
			diGender = scan.nextLine();
		}
		System.out.println();

		System.out.print("Input movie theater no.\t : ");
		int theaterNo = scan.nextInt();

		while (theaterNo < 1 || theaterNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}

		Theater theater = new Theater(movieId, movieName, new Director(diName, diEmail, diGender.charAt(0)), theaterNo);

		System.out.println();
		System.out.println(theater);
	}

}