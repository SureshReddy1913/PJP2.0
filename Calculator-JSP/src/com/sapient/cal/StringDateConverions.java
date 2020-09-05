package com.sapient.cal;

import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class StringDateConverions {

	public static Calendar stringToDate(String input1) {
		Calendar cal = Calendar.getInstance();
		
			try {
				cal.setTime(new SimpleDateFormat("dd-M-yyyy").parse(input1));
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		
		return cal;	
	}

	public static String dateToString(Calendar cal) {
		return (cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR));
	}

}
