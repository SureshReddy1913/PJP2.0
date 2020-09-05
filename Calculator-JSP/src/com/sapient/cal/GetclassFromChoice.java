package com.sapient.cal;

public class GetclassFromChoice {
	
	public static Operation getClassFromChoice(int choice,String flag) {
		
		if(choice==1) {
			return new SubtractDates();
		}
		if(choice==2) {
			return new AddSubDaysToDate(Integer.parseInt(flag));
		}
		else if(choice==3) {
			return new AddSubWeeksToDate(Integer.parseInt(flag));
		}
		else if(choice==4) {
			return new AddSubMonthsToDate(Integer.parseInt(flag));
		}
		else if(choice==5) {
			return new GetWeekFromDate();
		}
		else if(choice==6) {
			return new GetWeekNumber();
		}
		return null;
	}

}
