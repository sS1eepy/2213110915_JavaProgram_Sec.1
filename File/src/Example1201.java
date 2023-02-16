import java.io.*;
import java.util.*;

public class Example1201 {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(new File("MemberLogin.txt"));
		while(read.hasNext()) {
			String fname = read.next();
			String lname = read.next();
			read.next();
			String email = read.next().toUpperCase();
			System.out.println(fname+" ("+email+")");
		}
		read.close();

	}

}
