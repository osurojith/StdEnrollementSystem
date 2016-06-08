package com.vikas.readText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.vikas.getsetData.ViewData;
import com.vikas.getsetData.getData;

public class ReadText extends ViewData {
	public String readData(String id) {
		BufferedReader br = null;
		//String line=null;
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(".//stdDetails.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				String[] details = sCurrentLine.split(" ");
				//System.out.println(details[0]);
				if (details[0].equals(id)){
					//System.out.println(details[1]);
				setName(details[1]);
				setDetals(details[2]);
				setAddress(details[3]);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		view();
		return "Invalid id";

	}
}
