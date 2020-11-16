package com.springboot.StudentProject;

import java.util.ArrayList;
import java.util.List;

import com.springboot.StudentProject.common.Constant;
import com.springboot.StudentProject.domain.request.StudentSortingRequest;
import com.springboot.StudentProject.domain.request.StudentSortingWrapperRequest;
import com.springboot.StudentProject.service.StudentOperationService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentOperationService studentOperationService = new StudentOperationService();
    	
    	StudentSortingWrapperRequest StudentSortingWrapperRequest = new StudentSortingWrapperRequest();
    	
    	//prepare request
    	StudentSortingRequest request1 = new StudentSortingRequest();    	
    	request1.setKey(Constant.FIRST_NAME);
    	request1.setSortBy(Constant.SORT_BY_ASC);
    	
    	StudentSortingRequest request2 = new StudentSortingRequest();    	
    	request2.setKey(Constant.LAST_NAME);
    	request2.setSortBy(Constant.SORT_BY_DESC);
    	
    	List<StudentSortingRequest> studentSortingRequestList = new ArrayList<StudentSortingRequest>();
    	studentSortingRequestList.add(request1);
    	studentSortingRequestList.add(request2);
    	
    	StudentSortingWrapperRequest.setRequestList(studentSortingRequestList);
    	
    	studentOperationService.studentOperationMethod(StudentSortingWrapperRequest);
    	
    	System.out.println();
    	System.out.println();
        System.out.println( "Hello World!" );
    }
}
