package com.sapient.cal;

import java.util.Calendar;

public class GetWeekNumber implements Operation {

	@Override
	public Calendar operation(Calendar cal) {
		int week_no = cal.get(Calendar.WEEK_OF_YEAR);
		Cal_runner.session.setOutput(""+week_no);
		System.out.println("\nWeek number of the given date in an year: " + week_no);
		return null;
	}

}
