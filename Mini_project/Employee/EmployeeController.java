package com.arraylist.employee;

import java.util.Scanner;

public class EmployeeController {
	Employee[] emp = new Employee[5];
	Scanner s = new Scanner(System.in);
	int i = 0;

	public void save(Employee e) {
		emp[i++] = e;
		System.out.println("Data saved");
	}

	public void getDataAll() {
		for (int i = 0; i < emp.length; i++) {
			if (emp[i] != null) {
				System.out.println(i+1);
				System.out.println("EMPLOYEE ID  " + emp[i].eid);
				System.out.println("EMPLOYEE NAME  " + emp[i].ename);
				System.out.println("EMPLOYEE MOBILE NUMBER  " + emp[i].mobno);
				System.out.println("EMPLOYEE SALARY  " + emp[i].sal);
			}
		}
	}

	public Employee getData(int id) {
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].eid == id) {
				return emp[i];
			}
		}
		return null;
	}

	public void update(int id) {
		System.out.println("1.Update Name\n2.Update Mobile Number\n3.Update salary");
		System.out.println("Enter your choice");
		int choice = s.nextInt();
		switch (choice) {
		case 1: {
			for (int i = 0; i < emp.length; i++) {
				if (emp[i].eid == id) {
					System.out.println("Enter the Name to be changed");
					emp[i].ename = s.next();
					System.out.println("Changes are saved");
					break;
				}
			}
		}
			break;
		case 2: {
			for (int i = 0; i < emp.length; i++) {
				if (emp[i].eid == id) {
					System.out.println("Enter the Mobile Number to be changed");
					emp[i].mobno = s.nextLong();
					System.out.println("Changes are saved");
					break;
				}
			}
		}
			break;
		case 3: {
			for (int i = 0; i < emp.length; i++) {
				if (emp[i].eid == id) {
					System.out.println("Enter the Salary to be changed");
					emp[i].sal = s.nextDouble();
					System.out.println("Changes are saved");
					break;
				}
			}

		}
		}
	}
}
