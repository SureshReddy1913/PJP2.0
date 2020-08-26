package com.sapient.salaryCal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IncomeProcessor {

	Map<String, Double > currencyConversion;
	
	IncomeProcessor(){
		currencyConversion = new HashMap<>();
		currencyConversion.put("INR", (double) 66);
		currencyConversion.put("GBP", 0.67);
		currencyConversion.put("SGP", 1.5);
		currencyConversion.put("HKD", (double) 8);
	}
	
	
	public Map<OutputAttributes, Double> getCaluclatedRecords(List<InputAttributes> inputAttributes) {
		Map<OutputAttributes, Double> map=new HashMap<>();
		Map<OutputAttributes, Integer> count=new HashMap<>();
		OutputAttributes ot;
		
		for(InputAttributes it: inputAttributes) {
			ot=new OutputAttributes();
			String country= it.getCountry();
			if(country.isEmpty()) {
				ot.setCountryOrCity(it.getCity());
			}
			else {
				ot.setCountryOrCity(country);
			}
			ot.setGender(it.getGender());
			
			Double amount;
			if(it.getCurrency().equals("USD"))
					amount = it.getAmount();
			else
					amount=getConvertedAmount(it.getCurrency(),it.getAmount());
			
			if(map.get(ot)==null) {
				map.put(ot,amount);
				count.put(ot,1);
			}
			else {
				int gen_count=count.get(ot);
				map.put(ot, ((map.get(ot)*gen_count)+amount)/(gen_count+1));
				count.put(ot, gen_count+1);
			}
		}
		return map;
	}

	private Double getConvertedAmount(String currency, double amount) {
		return amount/currencyConversion.get(currency);
	}

	
	
	

}
