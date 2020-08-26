package com.sapient.salaryCal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVWriter;

public class FileIO {

	private static String inputfile="sample_input.csv";
	private static String outputfile="output.csv";
	
	public List<InputAttributes> readInpuRecords() {
		List<InputAttributes> inputAttributes = new ArrayList<InputAttributes>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputfile))) {
			String data = "";
			int count = 0;
			while((data = br.readLine()) != null) {
				count++;
				if(count == 1)
					continue;
				
				String [] row = data.split(",");
				InputAttributes inputAttribute = new InputAttributes();
				inputAttribute.setCity(row[0]);
				inputAttribute.setCountry(row[1]);
				inputAttribute.setGender(row[2]);
				inputAttribute.setCurrency(row[3]);
				inputAttribute.setAmount(Double.parseDouble(row[4]));
				inputAttributes.add(inputAttribute);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputAttributes;
	}

	public void writeRecords(List<OutputAttributes> ar, Map<OutputAttributes, Double> map) {
		File file = new File(outputfile);
		try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file))) {
			
			String [] list = {"Country/City", "Gender", "Average Income(in USD)"};
			csvWriter.writeNext(list);
			for (OutputAttributes ot : ar) {
				String [] row = new String[3];
				row[0] = ot.getCountryOrCity();
				row[1] = ot.getGender(); 
				row[2] = Double.toString(map.get(ot));
				csvWriter.writeNext(row);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
