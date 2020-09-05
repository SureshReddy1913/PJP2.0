package com.sapient.cal;

import java.util.Calendar;

public class AddSubDaysToDate implements Operation {

	int flag;
	AddSubDaysToDate(int flag){
		this.flag=flag;
	}
	@Override
	public SessionClass operation(Calendar cal,SessionClass session) {
		int days = Integer.parseInt(session.input);
		cal.add(Calendar.DAY_OF_MONTH, (flag*days));
		session.setOutput(StringDateConverions.dateToString(cal));
		return session;
	}

}
