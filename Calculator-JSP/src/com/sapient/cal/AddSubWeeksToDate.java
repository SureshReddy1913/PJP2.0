package com.sapient.cal;

import java.util.Calendar;

public class AddSubWeeksToDate implements Operation {

	int flag;
	AddSubWeeksToDate(int flag){
		this.flag=flag;
	}
	@Override
	public SessionClass operation(Calendar cal,SessionClass session) {
		int days = Integer.parseInt(session.input);
		cal.add(Calendar.WEEK_OF_YEAR, (flag*days));
		session.setOutput(StringDateConverions.dateToString(cal));
		return session;
	}

}
