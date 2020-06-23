package EmailApp;

import java.util.*;
public class Email {
	private String firstName,lastName,password,department,email,alternateEmail;
	private int mailBoxCapacity = 500,defaultPasswordLength = 10;
	
	//constructor to receive the first name and second name
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//calling method asking for deparment
		this.department = setDepartment();
		
		//call a method that return random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() +"."+lastName.toLowerCase()+"@"+department.toLowerCase()+".com";
	}
	//Ask for the department
	private String setDepartment() {
		System.out.println("Enter your deparment");
		Scanner in = new Scanner(System.in);
		String dept = in.next();
		in.close();
		return dept;
	}
	
	//Generate a random password
	private String randomPassword(int len) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&*";
		char[] password = new char[len];
		for(int i=0;i<len;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	//set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {return mailBoxCapacity; }
	public String getAlternateEmail() {return alternateEmail; }
	public String getPassword() {return password; }
	
	public String info() {
		return "Name: "+firstName+" "+lastName+"\nEmail: "+email+"\nMailbox Capacity: "+mailBoxCapacity;	}

}
