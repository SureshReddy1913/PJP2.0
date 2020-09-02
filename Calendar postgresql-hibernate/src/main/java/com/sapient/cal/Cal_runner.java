package com.sapient.cal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Cal_runner {

	static int choice;
	static SessionClass session;
	
	public static void main(String[] args) {
		
		char ch;
		Database_interact databaseIO=new Database_interact();
		do {
			Question_class que=new Question_class();
			session=new SessionClass();
			que.display_menu();
			choice=que.get_choice();
		System.out.println("choice made -> "+choice);
		Operation operation=GetclassFromChoice.getClassFromChoice(choice);
		session.setSession_num(databaseIO.getSessionNum()+1);
		if(choice!=1) {
			Calendar cal=getCalInput();
			displayOutput(operation.operation(cal));
			databaseIO.savetoDB(session);
			FileIO.add_session(session);
		}
		else
		{
			System.out.println("Give your choice");
			System.out.println("1 - Get records based on opertions");
			System.out.println("2 - Get records on session number");
			int choice_made=Read.scanner.nextInt();
			if(choice_made==1) {
				System.out.println("Enter the operation num");
				databaseIO.retrieveFromDB_operations(Read.scanner.nextInt());
			}
			else {
				System.out.println("Enter the number of sessions to be retrieved");
				databaseIO.retrieveFromDB_sessions(Read.scanner.nextInt());
			}
			
			//FileIO.display_history();
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
