package com.springboot.StudentProject.service;

import java.util.Comparator;
import java.util.Map;

public class FirstNameLastNameAscSortingService implements Comparator<Map<String, Object>> {

	public int compare(Map<String, Object> o1, Map<String, Object> o2) {

		String studObj1 = (String) o1.get("firstName");

		String studObj2 = (String) o2.get("firstName");

		String studObj3 = (String) o1.get("lastName");

		String studObj4 = (String) o2.get("lastName");

		int result = studObj1.compareTo(studObj2);
		
		int result1 = -studObj3.compareTo(studObj4);
		
		if(result != 0){
			return result;
		}
		return  result1;
		
		//return result + result1;

	}
}
