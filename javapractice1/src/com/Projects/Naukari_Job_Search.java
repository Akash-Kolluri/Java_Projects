
package com.Projects;

import java.util.Scanner;

public class Naukari_Job_Search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.println(" WELCOME TO NAUKARI_JOB_SEARCH");
  

        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Are you a Graduate or Under Graduate?");
        String grad = sc.next();

        if (grad.equalsIgnoreCase("graduate")) {

            System.out.println("Graduation requirement cleared!");

            System.out.println("Enter your stream:");
            String stream = sc.next();

            if (stream.equalsIgnoreCase("cse") ||
                stream.equalsIgnoreCase("it")) {

                System.out.println("Your stream matches our requirements!");

                System.out.println("Enter your percentage:");
                double per = sc.nextDouble();

                if (per >= 70) {

                    System.out.println("Academic eligibility cleared!");

                    System.out.println("Do you have any active backlogs? (yes/no)");
                    String backlog = sc.next();

                    if (backlog.equalsIgnoreCase("no")) {

                        System.out.println("Backlog verification successful!");

                        System.out.println("Enter your technical skill:");
                        String skill = sc.next();

                        if (skill.equalsIgnoreCase("java") ||
                            skill.equalsIgnoreCase("python") ||
                            skill.equalsIgnoreCase("aws")) {

                            System.out.println("Technical skills matched!");

                            System.out.println("Are you willing to relocate? (yes/no)");
                            String relocate = sc.next();

                            if (relocate.equalsIgnoreCase("yes")) {

                    
                                System.out.println("Your application is shortlisted!");
                                System.out.println("You are eligible for the interview.");
                                System.out.println("Our HR team will contact you soon.");

                            } else {
                                System.out.println("Sorry! Relocation is mandatory.");
                            }

                        } else {
                            System.out.println("Your skillSet Mismatched ,Required skills: Java, Python or AWS.");
                        }

                    } else {
                        System.out.println("Candidates with active backlogs are not eligible.");
                    }

                } else {
                    System.out.println("Sorry! Minimum 70% is required.");
                }

            } else {
                System.out.println("We have openings only for CSE and IT.");
            }

        } else {
            System.out.println("Sorry! We are hiring graduates only.");
        }

        sc.close();
    }
}
