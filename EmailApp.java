package EmailApp;

import java.util.*;
public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fName = sc.nextLine();
		System.out.println("Enter your last name");
		String lName = sc.nextLine();
		Email em1 = new Email(fName,lName); 
		System.out.println(em1.info());
		sc.close();
	}
}
