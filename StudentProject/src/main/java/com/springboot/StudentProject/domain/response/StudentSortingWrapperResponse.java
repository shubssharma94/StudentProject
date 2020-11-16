package com.springboot.StudentProject.domain.response;

import java.util.List;

public class StudentSortingWrapperResponse {
	
	private String responseCode;
	
	private String responseDescription;
	
	private StudentSortingResponse response;
	
	private List<StudentSortingResponse> responseList;

	/**
	 * @return the response
	 */
	public StudentSortingResponse getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(StudentSortingResponse response) {
		this.response = response;
	}

	/**
	 * @return the responseList
	 */
	public List<StudentSortingResponse> getResponseList() {
		return responseList;
	}

	/**
	 * @param responseList the responseList to set
	 */
	public void setResponseList(List<StudentSortingResponse> responseList) {
		this.responseList = responseList;
	}

	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @return the responseDescription
	 */
	public String getResponseDescription() {
		return responseDescription;
	}

	/**
	 * @param responseDescription the responseDescription to set
	 */
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentSortingWrapperResponse [responseCode=");
		builder.append(responseCode);
		builder.append(", responseDescription=");
		builder.append(responseDescription);
		builder.append(", response=");
		builder.append(response);
		builder.append(", responseList=");
		builder.append(responseList);
		builder.append("]");
		return builder.toString();
	}

}
