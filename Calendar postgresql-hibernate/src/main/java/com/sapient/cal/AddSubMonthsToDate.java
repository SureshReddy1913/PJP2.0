package com.sapient.cal;

import java.util.Calendar;

public class AddSubMonthsToDate implements Operation {

	int flag;
	AddSubMonthsToDate(int flag){
		this.flag=flag;
	}
	@Override
	public Calendar operation(Calendar cal) {
		System.out.println("Enter the number of months :");
		int months=Read.scanner.nextInt();
		Cal_runner.session.setInputs(""+months);
		cal.add(Calendar.MONTH, flag*months);
		return cal;
	}

}
