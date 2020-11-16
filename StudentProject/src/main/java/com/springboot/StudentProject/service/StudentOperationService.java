package com.springboot.StudentProject.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.springboot.StudentProject.common.Constant;
import com.springboot.StudentProject.domain.StudentWrapper;
import com.springboot.StudentProject.domain.request.StudentSortingRequest;
import com.springboot.StudentProject.domain.request.StudentSortingWrapperRequest;
import com.springboot.StudentProject.domain.response.StudentSortingResponse;
import com.springboot.StudentProject.domain.response.StudentSortingWrapperResponse;

public class StudentOperationService {

	public void studentOperationMethod(StudentSortingWrapperRequest studentSortingWrapperRequest) {
		StudentWrapper studentWrapper = null;
		try {
			// add student
			studentWrapper = addStudent();

			System.out.println("Before SOrt  " + studentWrapper.getMapList());
			System.out.println();
			System.out.println();

			// sort object
			if (null != studentWrapper) {
				sortStudent(studentWrapper, studentSortingWrapperRequest);
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	public StudentWrapper addStudent() {
		StudentWrapper studentWrapper = null;
		try {

			studentWrapper = new StudentWrapper();

			List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();

			Map<String, Object> mapDemo1 = new HashMap<String, Object>();
			mapDemo1.put("firstName", "SHubham");
			mapDemo1.put("lastName", "SHarma");
			mapDemo1.put("marks", "10");

			Map<String, Object> mapDemo2 = new HashMap<String, Object>();
			mapDemo2.put("firstName", "Sam");
			mapDemo2.put("lastName", "varma");
			mapDemo2.put("marks", "30");

			Map<String, Object> mapDemo3 = new HashMap<String, Object>();
			mapDemo3.put("firstName", "Jorden");
			mapDemo3.put("lastName", "Karter");
			mapDemo3.put("marks", "20");

			Map<String, Object> mapDemo4 = new HashMap<String, Object>();
			mapDemo4.put("firstName", "SHubham");
			mapDemo4.put("lastName", "Aunior");
			mapDemo4.put("marks", "10");

			mapList.add(mapDemo1);
			mapList.add(mapDemo2);
			mapList.add(mapDemo3);
			mapList.add(mapDemo4);

			studentWrapper.setMapList(mapList);

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return studentWrapper;
	}

	public void sortStudent(StudentWrapper studentWrapper, StudentSortingWrapperRequest studentSortingWrapperRequest) {

		//get request list
		List<StudentSortingRequest> requestList = studentSortingWrapperRequest.getRequestList();

		StudentSortingResponse studentSortingResponse = null;

		StudentSortingWrapperResponse wrapperResponse = new StudentSortingWrapperResponse();

		List<StudentSortingResponse> responseList = new ArrayList<StudentSortingResponse>();

		if (null != requestList) {
			for (StudentSortingRequest studentSortingRequestObj : requestList) {
				
				List<Map<String, Object>> tempMapList = new ArrayList<Map<String,Object>>(studentWrapper.getMapList());
				
				if (Constant.SORT_BY_ASC.equalsIgnoreCase(studentSortingRequestObj.getSortBy())) {
					studentSortingResponse = new StudentSortingResponse();
					studentWrapper.setTempMapList(tempMapList);
					
					// sort by ascending
					sortByASC(studentWrapper.getTempMapList(), studentSortingRequestObj.getKey());
					
					//set response details
					studentSortingResponse.setSortRequestKey(studentSortingRequestObj.getKey());
					studentSortingResponse.setSortRequestSortBy(studentSortingRequestObj.getSortBy());
					studentSortingResponse.setMapList(studentWrapper.getTempMapList());
					responseList.add(studentSortingResponse);
				} else if (Constant.SORT_BY_DESC.equalsIgnoreCase(studentSortingRequestObj.getSortBy())) {
					studentSortingResponse = new StudentSortingResponse();
					studentWrapper.setTempMapList(tempMapList);
					// sort by descending
					sortByDESC(studentWrapper.getTempMapList(), studentSortingRequestObj.getKey());
					
					//set response details
					studentSortingResponse.setSortRequestKey(studentSortingRequestObj.getKey());
					studentSortingResponse.setSortRequestSortBy(studentSortingRequestObj.getSortBy());
					studentSortingResponse.setMapList(studentWrapper.getTempMapList());
					responseList.add(studentSortingResponse);
				}
			}
		}

		wrapperResponse.setResponseCode("000");
		wrapperResponse.setResponseDescription("SUCCESS");
		wrapperResponse.setResponseList(responseList);

		System.out.println(responseList);

	}

	private void sortByASC(List<Map<String, Object>> mapList, final String key) {
		Collections.sort(mapList, new Comparator<Map<String, Object>>() {
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				String studObj1 = (String) o1.get(key);

				String studObj2 = (String) o2.get(key);

				return studObj1.compareTo(studObj2);
			}
		});
	}
	
	private void sortByDESC(List<Map<String, Object>> mapList, final String key) {
		Collections.sort(mapList, new Comparator<Map<String, Object>>() {
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				String studObj1 = (String) o1.get(key);

				String studObj2 = (String) o2.get(key);

				return - studObj1.compareTo(studObj2);
			}
		});
	}

}
