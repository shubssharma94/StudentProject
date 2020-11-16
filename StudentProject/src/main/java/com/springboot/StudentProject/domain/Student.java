package com.springboot.StudentProject.domain;

public class Student {
	
	private Integer studentId;
	
	private String firstName;
	
	private String lastName;
	
	private Integer studentMarks;
	
	/**
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the studentMarks
	 */
	public Integer getStudentMarks() {
		return studentMarks;
	}

	/**
	 * @param studentMarks the studentMarks to set
	 */
	public void setStudentMarks(Integer studentMarks) {
		this.studentMarks = studentMarks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentId=");
		builder.append(studentId);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", studentMarks=");
		builder.append(studentMarks);
		builder.append("]");
		return builder.toString();
	}
}
