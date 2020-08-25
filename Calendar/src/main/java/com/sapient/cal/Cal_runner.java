package com.sapient.cal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Cal_runner {

	static int choice;
	static Session session;
	
	public static void main(String[] args) {
		
		char ch;
		do {
			Question_class que=new Question_class();
			session=new Session();
			choice=que.get_choice();
		System.out.println("choice made -> "+choice);
		Operation operation=GetclassFromChoice.getClassFromChoice(choice);
		
		if(choice!=1) {
			Calendar cal=getCalInput();
			displayOutput(operation.operation(cal));
			session.add_session();
		}
		else
		{
			session.display_history();
		}
		System.out.println("DO YOU WANT TO CONTINUE(Y/N)?");
		ch=Read.scanner.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		
	}
	
	static Calendar getCalInput() {
		 Calendar cal=Calendar.getInstance();
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US); 
		 System.out.println("Enter the date in dd-mm-yyyy format :");
		 try {
		 cal.setTime(formatter.parse(Read.scanner.next()));
		 session.setInputs(dateToString(cal));
		 return cal;
		 }
		 catch(ParseException e){
			 e.printStackTrace();
		 }
		return null;
	}
	 
	 public static void displayOutput(Calendar cal) {
		 if(cal!=null) {
			 String output=dateToString(cal);
			 session.setOutput(output);
			 System.out.println(output);
		 	}
		 }
	 
	 public static String dateToString(Calendar cal) {
		 return cal.get(Calendar.DATE) + "-" + 
			    	(cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.YEAR);
		}

}
