package com.sapient.cal;

public class GetclassFromChoice {
	
	public static Operation getClassFromChoice(int choice) {
		
		if(choice==2) {
			return new AddSubDaysToDate(1);
		}
		else if(choice==3) {
			return new AddSubWeeksToDate(1);
		}
		else if(choice==4) {
			return new AddSubMonthsToDate(1);
		}
		else if(choice==5) {
			return new SubtractDates();
		}
		else if(choice==6) {
			return new AddSubDaysToDate(-1);
		}
		else if(choice==7) {
			return new AddSubWeeksToDate(-1);
		}
		else if(choice==8) {
			return new AddSubMonthsToDate(-1);
		}
		else if(choice==9) {
			return new GetWeekFromDate();
		}
		else if(choice==10) {
			return new GetWeekNumber();
		}
		return null;
	}

}
