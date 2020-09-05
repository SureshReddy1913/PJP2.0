package com.sapient.cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetWeekFromDate implements Operation {

	@Override
	public SessionClass operation(Calendar cal,SessionClass session) {
		String day = new SimpleDateFormat("EEEE").format(cal.getTime());
		session.setOutput(day);
		return session;
	}

}
