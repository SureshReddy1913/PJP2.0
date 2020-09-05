package com.sapient.cal;

import java.util.Calendar;

public class GetWeekNumber implements Operation {

	@Override
	public SessionClass operation(Calendar cal,SessionClass session) {
		int week_no = cal.get(Calendar.WEEK_OF_YEAR);
		session.setOutput(""+week_no);
		return session;
	}

}
