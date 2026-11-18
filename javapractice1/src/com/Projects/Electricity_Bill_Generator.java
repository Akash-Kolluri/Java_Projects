package com.Projects;

import java.util.Scanner;

public class Electricity_Bill_Generator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Customer Type:[Domestic/Commercial/Industrial] ");
	String custType=sc.next();
	double bill=0;
	switch(custType) {
	case "Domestic"->{
		System.out.println("You are Domestic Type ");
	    System.out.println("Enter Number of Units Consumed");
	    int unit=sc.nextInt();
	    bill=unit*5;
	    System.out.println("Your Electricity bill is : "+bill+"/-");
	}
	case "Commercial"->{
		System.out.println("You are Commercial Type ");
	    System.out.println("Enter Number of Units Consumed");
	    int unit=sc.nextInt();
	    bill=unit*8;
	    System.out.println("Your Electricity bill is : "+bill+"/-");
		
	}
	case "Industrial"->{
		System.out.println("You are Industrial Type ");
	    System.out.println("Enter Number of Units Consumed");
	    int unit=sc.nextInt();
	    bill=unit*10;
	    System.out.println("Your Electricity bill is : "+bill+"/-");
		
	}

	}

}
}
