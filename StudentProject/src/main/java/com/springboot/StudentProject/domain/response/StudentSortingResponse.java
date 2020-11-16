package com.springboot.StudentProject.domain.response;

import java.util.List;
import java.util.Map;

public class StudentSortingResponse {
	
	private String sortRequestKey;
	
	private String sortRequestSortBy;
	
	private List<Map<String, Object>> mapList;

	/**
	 * @return the sortRequestKey
	 */
	public String getSortRequestKey() {
		return sortRequestKey;
	}

	/**
	 * @param sortRequestKey the sortRequestKey to set
	 */
	public void setSortRequestKey(String sortRequestKey) {
		this.sortRequestKey = sortRequestKey;
	}

	/**
	 * @return the sortRequestSortBy
	 */
	public String getSortRequestSortBy() {
		return sortRequestSortBy;
	}

	/**
	 * @param sortRequestSortBy the sortRequestSortBy to set
	 */
	public void setSortRequestSortBy(String sortRequestSortBy) {
		this.sortRequestSortBy = sortRequestSortBy;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentSortingResponse [sortRequestKey=");
		builder.append(sortRequestKey);
		builder.append(", sortRequestSortBy=");
		builder.append(sortRequestSortBy);
		builder.append(", mapList=");
		builder.append(mapList);
		builder.append("]");
		return builder.toString();
	}
}
