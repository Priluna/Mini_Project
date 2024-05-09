package com.qsp.collection;

import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeController {
	private ArrayList<Employee> emp = new ArrayList<Employee>();
	Scanner s = new Scanner(System.in);

	public void save(Employee e) {
		if (e != null) {
			emp.add(e);
		} else
			throw new NullPointerException();
	}

	public void getData() {
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));
		}
	}

	public void getDataById(int id) {
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getId() == id) {
				System.out.println(emp.get(i));
			} else {
				throw new InvalidIdException("invalid Id");
			}
		}
	}

	public void remove(int id) {
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getId() == id) {
				emp.remove(i);
			} else {
				throw new InvalidIdException("invalid Id");
			}
		}
	}

	public void update() {
		System.out.println("enter the Id to change employee data");
		int id = s.nextInt();
		System.out.println("1) Update name\n2) Update Mobile Number\n3) Update Email\n4)Update Designation");
		System.out.println("enter your choice");
		int c = s.nextInt();
		switch (c) {
		case 1: {
			for (int i = 0; i < emp.size(); i++) {
				if (emp.get(i).getId() == id) {
					System.out.println("enter the new Name to be changed");
					emp.get(i).setName(s.next());
					System.out.println("changes are saved");
				} else {
					throw new InvalidIdException("invalid Id");
				}
			}
		}
			break;
		case 2: {
			for (int i = 0; i < emp.size(); i++) {
				if (emp.get(i).getId() == id) {
					System.out.println("enter the new Mobile Number to be changed");
					emp.get(i).setMobileNo(s.nextLong());
					System.out.println("changes are saved");
				} else {
					throw new InvalidIdException("invalid Id");
				}
			}
		}
			break;
		case 3: {
			for (int i = 0; i < emp.size(); i++) {
				if (emp.get(i).getId() == id) {
					System.out.println("enter the new Email to be changed");
					emp.get(i).setEmail(s.next());
					System.out.println("changes are saved");
				} else {
					throw new InvalidIdException("invalid Id");
				}
			}
		}
			break;
		case 4: {
			for (int i = 0; i < emp.size(); i++) {
				if (emp.get(i).getId() == id) {
					System.out.println("enter the new designation to be changed");
					emp.get(i).setJob(s.next());
					System.out.println("changes are saved");
				} else {
					throw new InvalidIdException("invalid Id");
				}
			}
		}
			break;
		}

	}
}
