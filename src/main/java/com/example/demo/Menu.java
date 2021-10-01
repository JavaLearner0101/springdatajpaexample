package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Menu {

	public void menuoption() {
		System.out.println(" ");
		System.out.println(" -----------------------------------");
		System.out.println("Select Enter option");
		System.out.println("1 : Enter student details");
		System.out.println("2: Enter courses details");
		System.out.println("3. Delete courses details");
		System.out.println("4. View details via student ID ");
		System.out.println("5. Find if student exist by name");
		System.out.println("6. Delete student by student ID");
		System.out.println(" -----------------------------------");
	}	
}
