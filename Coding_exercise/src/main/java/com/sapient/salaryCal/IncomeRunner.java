package com.sapient.salaryCal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IncomeRunner {

	public static void main(String[] args) {
		
		List<InputAttributes> inputAttributes=new ArrayList<>();
		FileIO fileIO=new FileIO();
		inputAttributes=fileIO.readInpuRecords();
		
		IncomeProcessor incomeProcessor= new IncomeProcessor();
		Map<OutputAttributes, Double> map=new HashMap<>();
		
		map=incomeProcessor.getCaluclatedRecords(inputAttributes);
		
		List<OutputAttributes> ot=new ArrayList<>(map.keySet());
	
		
		Collections.sort(ot, new SortClass()); 
	
		fileIO.writeRecords(ot,map);
		
		System.out.println("----------program finished---------------");

	}

}

class SortClass implements Comparator<OutputAttributes>{
	public int compare(OutputAttributes ot1,OutputAttributes ot2) {
		if(ot1.getCountryOrCity().equals(ot2.getCountryOrCity())){
			return (ot1.getGender().compareTo(ot2.getGender()));
			}
		return (ot1.getCountryOrCity().compareTo(ot2.getCountryOrCity()));
	}
}
