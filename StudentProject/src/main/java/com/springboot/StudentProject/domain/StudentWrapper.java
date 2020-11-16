package com.springboot.StudentProject.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentWrapper {
	
	private Student studentObj;
	
	private List<Student> studentList;
	
	private List<Map<String, Object>> mapList;
	
	private HashMap<Integer, Student> mapObj;
	
	private List<Map<String, Object>> tempMapList;

	/**
	 * @return the studentObj
	 */
	public Student getStudentObj() {
		return studentObj;
	}

	/**
	 * @param studentObj the studentObj to set
	 */
	public void setStudentObj(Student studentObj) {
		this.studentObj = studentObj;
	}

	/**
	 * @return the studentList
	 */
	public List<Student> getStudentList() {
		return studentList;
	}

	/**
	 * @param studentList the studentList to set
	 */
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	/**
	 * @return the mapList
	 */
	public List<Map<String, Object>> getMapList() {
		return mapList;
	}

	/**
	 * @param mapList the mapList to set
	 */
	public void setMapList(List<Map<String, Object>> mapList) {
		this.mapList = mapList;
	}

	/**
	 * @return the mapObj
	 */
	public HashMap<Integer, Student> getMapObj() {
		return mapObj;
	}

	/**
	 * @param mapObj the mapObj to set
	 */
	public void setMapObj(HashMap<Integer, Student> mapObj) {
		this.mapObj = mapObj;
	}

	/**
	 * @return the tempMapList
	 */
	public List<Map<String, Object>> getTempMapList() {
		return tempMapList;
	}

	/**
	 * @param tempMapList the tempMapList to set
	 */
	public void setTempMapList(List<Map<String, Object>> tempMapList) {
		this.tempMapList = tempMapList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentWrapper [studentObj=");
		builder.append(studentObj);
		builder.append(", studentList=");
		builder.append(studentList);
		builder.append(", mapList=");
		builder.append(mapList);
		builder.append(", mapObj=");
		builder.append(mapObj);
		builder.append(", tempMapList=");
		builder.append(tempMapList);
		builder.append("]");
		return builder.toString();
	}
}
