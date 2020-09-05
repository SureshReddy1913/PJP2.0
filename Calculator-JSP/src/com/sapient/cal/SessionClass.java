package com.sapient.cal;

public class SessionClass {
	
	String input;
	String output;	

	public void setOutput(String output) {
		this.output = output;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	
	public String getOutput() {
		return output;
	}
	@Override
	public String toString() {
		return 
			 "\nInput: " + this.input
		    + "\nOutput: " + this.output + "\n";
	}
	
}
