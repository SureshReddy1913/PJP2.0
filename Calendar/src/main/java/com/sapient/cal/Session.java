package com.sapient.cal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Session {
	static final String file = "history";
	String operation;
	ArrayList<String> inputs = new ArrayList<>();
	String output;
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public void setInputs(String input) {
		this.inputs.add(input);
	}
	public void setOutput(String output) {
		this.output = output;
	}
	
	public void clearInputs() {
		this.inputs.clear();
	}
	public void add_session() {
		try (FileOutputStream fout = new FileOutputStream(file, true)) {
			fout.write((this.operation + "#" + this.inputs + "#"
					+ this.output + "\n").getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	 void display_history() {
		try {
			Scanner sc = new Scanner(new FileReader(file));
			while(sc.hasNext()) {
				String [] str = sc.nextLine().split("#");
				System.out.println("Operation performed: " + str[0]
								 + "\nInputs given: " + str[1]
								 + "\nOutput: " + str[2] + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
	
	@Override
	public String toString() {
		return "Operation: " + this.operation
			+ "\nInput: " + this.inputs
		    + "\nOutput: " + this.output + "\n";
	}
	
}
