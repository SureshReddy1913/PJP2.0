package com.sapient.cal;

import java.util.Calendar;

public class AddSubDaysToDate implements Operation {

	int flag;
	AddSubDaysToDate(int flag){
		this.flag=flag;
	}
	@Override
	public Calendar operation(Calendar cal) {
		System.out.println("Enter the number of days ");
		int days=Read.scanner.nextInt();
		Cal_runner.session.setInputs(""+days);
		cal.add(Calendar.DAY_OF_MONTH, (flag*days));
		return cal;
	}

}
