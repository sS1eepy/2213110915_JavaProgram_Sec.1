import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee {
	private String name,dept;
	
	public void insert() {
		Scanner console = new Scanner(System.in);
		PrintStream prs = new PrintStream(new File("employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name : ");
			name = console.next();
			System.out.print("Enter department : ");
			dept = console.next();
			prs.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = console.next();
		}while(answer.equalsIgnoreCase("y"));
		
	}

	public void read() {
		try {
			Scanner in = new Scanner (new File("employee.txt"));
			int i =0;
			boolean check = false;
			super.header();
			while(in.hasNext()) {
				name = in.next();
				dept = in.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.print(i+") "+name);
					check = true;
				}
			}
			if(check) {
				super.header();
				System.out.print("Employee in department "+ super.getDept()+" is "+i+" person.");
				super.header();
			}else {
				System.out.print("\nSorry,no department : "+super.getDept()+ " is file.");
			}
			
			
		}catch(IOException e) {
			System.out.print("\nSorry,file not found...");
		}
	}
}
