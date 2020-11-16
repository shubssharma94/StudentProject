package com.springboot.StudentProject.domain.request;

public class StudentSortingRequest {
	
	private String key;
	
	private String sortBy;

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the sortBy
	 */
	public String getSortBy() {
		return sortBy;
	}

	/**
	 * @param sortBy the sortBy to set
	 */
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentSortingRequest [key=");
		builder.append(key);
		builder.append(", sortBy=");
		builder.append(sortBy);
		builder.append("]");
		return builder.toString();
	}
	
}
