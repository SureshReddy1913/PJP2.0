package com.sapient.cal;

import java.util.Calendar;

public class AddSubMonthsToDate implements Operation {

	int flag;
	AddSubMonthsToDate(int flag){
		this.flag=flag;
	}
	@Override
	public SessionClass operation(Calendar cal,SessionClass session) {
		int days = Integer.parseInt(session.input);
		cal.add(Calendar.MONTH, (flag*days));
		session.setOutput(StringDateConverions.dateToString(cal));
		return session;
	}

}
