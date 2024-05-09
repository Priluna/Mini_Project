package com.qsp.collection;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EmployeeController controller = new EmployeeController();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("1) Save\n2) Get data\n3) Gat data single employee\n4) Remove\n5) Update\n6) Exit ");
			System.out.println("enter your choice");
			int choice = s.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("enter your id");
				int id = s.nextInt();
				System.out.println("enter your name");
				String name = s.next();
				System.out.println("enter your mobile number");
				long mobileNo = s.nextLong();
				System.out.println("enter your email");
				String email = s.next();
				System.out.println("enter your designation");
				String job = s.next();
				Employee e = new Employee(id, name, mobileNo, email, job);
				controller.save(e);
			}
				break;
			case 2: {
				controller.getData();
			}
				break;
			case 3: {
				System.out.println("enter the id");
				int id = s.nextInt();
				controller.getDataById(id);
			}
				break;
			case 4: {
				System.out.println("enter the id to be removed");
				int id = s.nextInt();
				controller.remove(id);
			}
				break;
			case 5:{
				controller.update();
			}break;
			case 6:{
				System.exit(0);
			}break;
		}
	}
}
}
