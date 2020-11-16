package com.springboot.StudentProject.domain.request;

import java.util.List;

public class StudentSortingWrapperRequest {
	
	private StudentSortingRequest request;
	
	private List<StudentSortingRequest> requestList;

	/**
	 * @return the request
	 */
	public StudentSortingRequest getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(StudentSortingRequest request) {
		this.request = request;
	}

	/**
	 * @return the requestList
	 */
	public List<StudentSortingRequest> getRequestList() {
		return requestList;
	}

	/**
	 * @param requestList the requestList to set
	 */
	public void setRequestList(List<StudentSortingRequest> requestList) {
		this.requestList = requestList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentSortingWrapperRequest [request=");
		builder.append(request);
		builder.append(", requestList=");
		builder.append(requestList);
		builder.append("]");
		return builder.toString();
	}
}
