package com.sapient.cal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

	static final String file = "history";
	public static void add_session(SessionClass session) {
		try (FileOutputStream fout = new FileOutputStream(file, true)) {
			fout.write((session.operation + "#" + session.inputs + "#"
					+ session.output + "\n").getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	 static void display_history() {
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
}
