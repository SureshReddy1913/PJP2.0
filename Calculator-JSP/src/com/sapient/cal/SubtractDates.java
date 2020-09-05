package com.sapient.cal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class SubtractDates implements Operation {

	@Override
	public SessionClass operation(Calendar cal,SessionClass session) {
		Calendar cal2= StringDateConverions.stringToDate(session.input);
		LocalDate date1, date2;
		if(cal.before(cal2)) {
			date1 = LocalDateTime.ofInstant(cal.toInstant(), cal.getTimeZone().toZoneId()).toLocalDate();
			date2 = LocalDateTime.ofInstant(cal2.toInstant(), cal2.getTimeZone().toZoneId()).toLocalDate();
		}
		else {
			date1 = LocalDateTime.ofInstant(cal2.toInstant(), cal2.getTimeZone().toZoneId()).toLocalDate();
			date2 = LocalDateTime.ofInstant(cal.toInstant(), cal.getTimeZone().toZoneId()).toLocalDate();
		}
		
		String output="years : "+ChronoUnit.YEARS.between(date1, date2)+
				", months : "+ChronoUnit.MONTHS.between(date1, date2)+
				", weeks : "+ChronoUnit.WEEKS.between(date1, date2)+
				", days : "+ChronoUnit.DAYS.between(date1, date2);
				
		session.setOutput(output);
		return session;
	}

}
