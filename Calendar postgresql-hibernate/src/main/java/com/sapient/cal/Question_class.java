package com.sapient.cal;

import java.util.HashMap;
import java.util.Map;

public class Question_class {
	
	Map<Integer,String> menu;
	
	Question_class(){
		menu=new HashMap<>();
		
		menu.put(1, "Display memory");
		menu.put(2, "Add Days to date");
		menu.put(3, "Add weeks to date");
		menu.put(4, "Add months to date");
		menu.put(5, "Subtract two dates");
		menu.put(6, "Subtract days from date");
		menu.put(7, "Subtract weeks from date");
		menu.put(8, "Subtract months from date");
		menu.put(9, "Get day of the date");
		menu.put(10, "Get week number in the year for the date");
	}
	void display_menu() {
		menu.forEach((key, value) -> {
			System.out.print(key);
			System.out.println(" -> " + value);
			});
	}
	
	int get_choice() {
		int choice;
		do{
			System.out.println("Enter you choice:");
			choice=Read.scanner.nextInt();
			Cal_runner.session.setOperation(menu.get(choice));
			if(choice<1||choice>10)
			System.out.println("Unacceptable choice");
			
		}while(choice<1||choice>10);
		return choice;
	}

}
