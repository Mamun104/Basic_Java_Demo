package ifelse_for_loop;

import java.util.Scanner;

//Write a program to calculate CGPA and find grade from 4 subjects

public class Program_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gpa = 0, total_gpa = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Input subject " + i + " marks: ");
            int marks = scanner.nextInt();
            if (marks >= 80 && marks <= 100) {
                gpa = 4.0;
            } else if (marks >= 75 && marks < 80) {
                gpa = 3.75;
            } else if (marks >= 70 && marks < 75) {
                gpa = 3.50;
            } else if (marks >= 65 && marks < 70) {
                gpa = 3.25;
            } else if (marks >= 60 && marks < 65) {
                gpa = 3.00;
            } else if (marks >= 55 && marks < 60) {
                gpa = 2.75;
            } else if (marks >= 50 && marks < 55) {
                gpa = 2.50;
            } else if (marks >= 40 && marks < 50) {
                gpa = 2.25;
            } else {
                gpa = 0.00;
            }
            total_gpa += gpa;
        }

        System.out.println("CGPA= "+total_gpa/4);

    }
}
