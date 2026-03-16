package onlinejavatraining;

import java.util.Scanner;

public class ExceptionHandling6 {

	public static void a(String name,int age) throws Exception{
		try {
			if(name.equalsIgnoreCase("tejashwini") && age<18 ) {
				throw new ExceptionHandling5CustomException("Age is less then 18 not eligible to vote");
			}else {
				System.out.println("eligible to vote");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("age is leass then 18-but exception handled");
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String n=sc.next();
		System.out.println("Enter your age");
		int a=sc.nextInt();
		a(n,a);
		System.out.println("custom exception");
	}

}
