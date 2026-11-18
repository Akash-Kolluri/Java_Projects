package com.Projects;

import java.util.Scanner;

public class FreshMarket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Fresh Market");
		
		int total=0;
		String ord="";
		String Cont="";
		do {
		System.out.println("Enter your Category : ");
		String catg=sc.next();
		switch(catg) {
		case "Vegetables"->{
			System.out.println("!!!!!Welcome to Vegetables world!!!!!\n");
			System.out.println("available vege's are :");
			System.out.println("Potato ₹35/kg");
			System.out.println("Tomato ₹30/kg");
			System.out.println("Onion ₹60/kg");
			System.out.println("Brinjal ₹30/kg");
			System.out.println("Carrot ₹45/kg");
			System.out.println("Select your item_type :");
			String item=sc.next();
			switch(item) {
			case "Potato"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=35*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			case "Tomato"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=30*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			case "Onion"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=60*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			case "Brinjal"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=30*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			case "Carrot"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=45*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			}
			
		}
		
		
		case "Fruits"->{
			System.out.println("!!!!!Welcome to Fruits world!!!!!\n");
			System.out.println("available Fruits are :");
			System.out.println("Apple ₹150/kg");
			System.out.println("Banana ₹60/kg");
			System.out.println("Orange ₹80/kg");
			System.out.println("Grapes ₹100/kg");
			System.out.println("Mango ₹120/kg");
			System.out.println("Select your item_type : ");
			String item=sc.next();
			switch(item) {
			case "Apple"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=150*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			case "Banana"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=60*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			case "Orange"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=80*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			case "Grapes"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=100*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			case "Mango"->{
				System.out.println("Enter "+item+" quantity");
				int qty=sc.nextInt();
				int price=120*qty;
				total+=price;
				ord+=item+" "+qty+" "+price+"\n";
			}
			}
			
		}
		}
		System.out.println("Do you want to continue Buying Vegetables/Fruits ?? (yes for y No for n");
		Cont=sc.next();

	}while("y".equalsIgnoreCase(Cont));
		System.out.println("Item_Name Qty Price");
		System.out.println(ord);
		System.out.println("Total Bill : "+total);
	}
}
