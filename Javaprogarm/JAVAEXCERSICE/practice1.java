package JAVAEXCERSICE;

import java.net.SocketTimeoutException;
import java.util.Scanner;

//1.Write a Java program to print 'Hello' on screen and then print your name on a separate line

public class practice1 {
public static void main(String[] args) {
//	 System.out.println("Hello\nGood this comes true! ");
	
	
	
	
	// That is Scanner class using this method
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter your First name:");
	String fname=obj.next();
	System.out.println("Enter your second name:");
	String lname=obj.next();
	System.out.println("Helleo\n" +fname+ lname);
	}

}
