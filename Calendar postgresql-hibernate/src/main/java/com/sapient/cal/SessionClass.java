package com.sapient.cal;


import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SessionClass {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	int session_num;
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

	public void setSession_num(int session_num) {
		this.session_num = session_num;
	}
	
	public int getSession_num() {
		return this.session_num;
	}
	public void clearInputs() {
		this.inputs.clear();
	}
	
	@Override
	public String toString() {
		return "Session: " + this.session_num
			+ "\nOperation: " + this.operation
			+ "\nInput: " + this.inputs
		    + "\nOutput: " + this.output + "\n";
	}
	
}
