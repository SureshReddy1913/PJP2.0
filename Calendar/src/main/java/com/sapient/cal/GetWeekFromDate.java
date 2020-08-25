package com.sapient.cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetWeekFromDate implements Operation {

	@Override
	public Calendar operation(Calendar cal) {
		String day = new SimpleDateFormat("EEEE").format(cal.getTime());
		Cal_runner.session.setOutput(day);
		System.out.println("\nDay of the given date is: " + day);
		return null;
	}

}
