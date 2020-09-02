package com.sapient.cal;

import java.util.Calendar;

public class AddSubWeeksToDate implements Operation {

	int flag;
	AddSubWeeksToDate(int flag){
		this.flag=flag;
	}
	@Override
	public Calendar operation(Calendar cal) {
		System.out.println("Enter the number of weeks: ");
		int weeks=Read.scanner.nextInt();
		Cal_runner.session.setInputs(""+weeks);
		cal.add(Calendar.WEEK_OF_YEAR, this.flag*weeks);
		return cal;
	}

}
