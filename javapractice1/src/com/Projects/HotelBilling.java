
package com.Projects;

import java.util.Scanner;

public class HotelBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        String choice;
        String orders = "";

        System.out.println("Welcome to Btech Restaurant");

        do {

            System.out.println("Enter food category (Veg/NonVeg/Naan's/Desserts):");
            String catg = sc.next();

            switch (catg) {

                case "Veg" -> {

                    System.out.println("Enter food type (Starters/Main_Course):");
                    String opt = sc.next();

                    switch (opt) {

                        case "Starters" -> {

                            System.out.println("paneer_65 - 250");
                            System.out.println("mushroom_65 - 350");
                            System.out.println("veg_manchuria - 220");

                            String ord = sc.next();
                            ;

                            switch (ord) {
                                case "paneer_65" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=250*qty;
                                    total += price;
                                    orders += "paneer_65 - 250/- ["+qty+"]\n";
                                }
                                case "mushroom_65" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=350*qty;
                                    total += price;
                                    orders += "mushroom_65 - 350/- ["+qty+"]\n";
                                }
                                case "veg_man" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=220*qty;
                                    total += price;
                                    orders += "veg_man - 220/- ["+qty+"]\n";
                                }
                                default -> System.out.println("Order not available");
                            }
                        }

                        case "Main_Course" -> {

                            System.out.println("paneer_Biryani - 450");
                            System.out.println("mushroom_Biryani - 450");
                            System.out.println("veg_Biryani - 320");

                            String ord = sc.next();

                            switch (ord) {
                                case "paneer_Biryani" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=450*qty;
                                    total += price;
                                    orders += "paneer_Biryani - 450/- ["+qty+"]\n";
                                }
                                case "mushroom_Biryani" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=450*qty;
                                    total += price;
                                    orders += "mushroom_Biryani - 450/- ["+qty+"]\n";
                                }
                                case "veg_Biryani" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=320*qty;
                                    total += price;
                                    orders += "veg_Biryani - 320/- ["+qty+"]\n";
                                }
                                default -> System.out.println("Order not available");
                            }
                        }

                        default -> System.out.println("Food type not available");
                    }
                }

                case "NonVeg" -> {

                    System.out.println("Enter food type (Starters/Main_Course):");
                    String opt = sc.next();

                    switch (opt) {

                        case "Starters" -> {

                            System.out.println("chicken_65 - 400");
                            System.out.println("prawns_65 - 470");
                            System.out.println("mutton_kebabs - 520");

                            String ord = sc.next();

                            switch (ord) {
                                case "chicken_65" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=400*qty;
                                    total += price;
                                    orders += "chicken_65 - 400/- ["+qty+"]\n";
                                }
                                case "prawns_65" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=470*qty;
                                    total += price;
                                    orders += "prawns_65 - 470/- ["+qty+"]\n";
                                }
                                case "mutton_kebabs" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=520*qty;
                                    total += price;
                                    orders += "mutton_kebabs - 520/- ["+qty+"]\n";
                                }
                                default -> System.out.println("Order not available");
                            }
                        }

                        case "Main_Course" -> {

                            System.out.println("chicken_Biryani - 450");
                            System.out.println("mutton_Biryani - 500");
                            System.out.println("prawns_Biryani - 470");

                            String ord = sc.next();

                            switch (ord) {
                                case "chicken_Biryani" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=450*qty;
                                    total += price;
                                    orders += "chicken_Biryani - 450/- ["+qty+"]\n";
                                }
                                case "mutton_Biryani" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=500*qty;
                                    total += price;
                                    orders += "mutton_Biryani - 500/- ["+qty+"]\n";
                                }
                                case "prawns_Biryani" -> {
                                	System.out.println("Enter quantity :");
                                	int qty=sc.nextInt();
                                	int price=470*qty;
                                    total += price;
                                    orders += "prawns_Biryani - 470/- ["+qty+"]\n";
                                }
                                default -> System.out.println("Order not available");
                            }
                        }

                        default -> System.out.println("Food type not available");
                    }
                }
                case "Naan's" ->{
                	 System.out.println("Enter Naan type :");
                	 System.out.println("Butter_Naan - 40");
                     System.out.println("Garlic_Naan - 50");
                     System.out.println("Cheese_Naan - 55");
                     String ord = sc.next();
                     switch(ord) {
                     case "Butter_Naan"->{
                    	 System.out.println("Enter quantity :");
                    	 int qty=sc.nextInt();
                     	int price=40*qty;
                         total += price;
                    	 orders+="Butter_Naan - 40/- ["+qty+"]\n";
                     }
                     case "Garlic_Naan"->{
                    	 System.out.println("Enter quantity :");
                    	 int qty=sc.nextInt();
                     	int price=50*qty;
                         total += price;
                    	 orders+="Garlic_Naan - 50/- ["+qty+"]\n";
                     }
                     case "Cheese_Naan"->{
                    	 System.out.println("Enter quantity :");
                    	 int qty=sc.nextInt();
                     	int price=55*qty;
                         total += price;
                    	 orders+="Cheese_Naan - 55/- ["+qty+"]\n";
                     }
                     default->System.out.println("Order not available");
                    	 
            
                     }
                }
                
                case "Desserts" ->{
               	 System.out.println("Enter Desserts type :");
               	 System.out.println("Gulab_jamun- 80");
                    System.out.println("Kheer - 120");
                    System.out.println("Sizzling_Brownie - 150");
                    String ord = sc.next();
                    switch(ord) {
                    case "Gulab_jamun"->{
                    	System.out.println("Enter quantity :");
                    	int qty=sc.nextInt();
                    	int price=80*qty;
                        total += price;
                   	    orders+="Gulab_jamun- 80/- ["+qty+"]\n";
                    }
                    case "Kheer"->{
                    	System.out.println("Enter quantity :");
                    	int qty=sc.nextInt();
                    	int price=120*qty;
                        total += price;
                   	 orders+="Kheer - 120/- ["+qty+"]\n";
                    }
                    case "Sizzling_Brownie"->{
                    	System.out.println("Enter quantity :");
                    	int qty=sc.nextInt();
                    	int price=150*qty;
                        total += price;
                   	 orders+="Sizzling_Brownie - 150/- ["+qty+"]\n";
                    }
                    default->System.out.println("Order not available");
                   	 
           
                    }
               }

                default -> System.out.println("Category not available");
            }

            System.out.println("Do you want to order again? (yes/no)");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

       
        System.out.println("FINAL BILL");
     

        System.out.println("Your Ordered Items:");
        System.out.println("Name price [qty]");
        System.out.println(orders);
        double gst=total*0.18;
        System.out.println("Gst: "+gst);
        System.out.println("Your total bill: " + (total + gst)+"/-");
        System.out.print("\n");
        System.out.println("Thank you for visiting Btech Restaurant!");

     
    }
}
