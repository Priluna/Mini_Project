package com.arraylist.employee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		EmployeeController e = new EmployeeController();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("1.Save\n2.Get Data of all employee\n3.Get data of a Employee\n4.Update\n5.Exit");
			System.out.println("enter your choice");
			int choice = s.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the Employee Id");
				int eid = s.nextInt();
				System.out.println("Enter the Employee Name");
				String ename = s.next();
				System.out.println("Enter the Employee Mobile Number");
				long mobno = s.nextLong();
				System.out.println("Enter the Employee salary");
				double sal = s.nextDouble();
				Employee a = new Employee(eid, ename, mobno, sal);
				e.save(a);
			}
				break;
			case 2: {
				e.getDataAll();
			}
				break;
			case 3: {
				System.out.println("Enter the id of the employee to get details");
				int id = s.nextInt();
				Employee m = e.getData(id);
				if (m != null) {
					System.out.println("EMPLOYEE ID  " + m.eid);
					System.out.println("EMPLOYEE NAME  " + m.ename);
					System.out.println("EMPLOYEE MOBILE NUMBER  " + m.mobno);
					System.out.println("EMPLOYEE SALARY  " + m.sal);
				}
			}
				break;
			case 4: {
				System.out.println("Enter the Id of the Employee to change details");
				int id = s.nextInt();
				e.update(id);
			}
				break;
			case 5: {
				System.exit(0);
			}
				break;
			}
		}
		
	}
}
