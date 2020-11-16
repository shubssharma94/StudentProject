package com.springboot.StudentProject.service;

import java.util.Comparator;
import java.util.Map;

public class FirstNameAscSortingService implements Comparator<Map<String, Object>> {

	public int compare(Map<String, Object> o1, Map<String, Object> o2) {

		String studObj1 = (String) o1.values().toArray()[0];

		String studObj2 = (String) o2.values().toArray()[0];

		return studObj1.compareTo(studObj2);

	}

}
