package com.cjc.model;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Task {
	public static void main(String[] args) {
		System.out.println("welcome to XXXXXXXXXX univercity \n");
		Scanner sc = new Scanner(System.in);
		College col = new College();
		while (true) {

			System.out.println("please select one action");
			System.out.println(" 1. Add Student \n 2. View Student \n 3. delete Student \n 4.update Student \n");
			int choice = sc.nextInt();
			Operation o = new Operation();
			switch (choice) {
			case 1:
				System.out.println("Fill Student Information Form");
				o.addstudent();
				break;
			case 2:
				System.out.println("View Student Information");
				o.viewstudent();
				break;

			case 3:
				System.out.println("Delete Student");
				o.deleteStudent();
				break;

			case 4:
				System.out.println("update Student");
				o.UpadateStudent();
				break;

			default:
				System.out.println("please enter propper input");
				break;
			}
		}

	}
}
