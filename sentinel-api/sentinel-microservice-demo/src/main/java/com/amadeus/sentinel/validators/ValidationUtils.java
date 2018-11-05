package com.amadeus.sentinel.validators;

import java.util.Map;

import com.amadeus.sentinel.models.Obe;
/**
 * Utility class for Validation Purposes. This can also be done with Spring Boot Validation , if using Hibernate
 * @author sinhas
 *
 */
public class ValidationUtils {
	/**
	 * Checks Whether Request Body Sent For Updating Obe is Valid
	 * @param requestBody
	 * @return boolean
	 */
	public static String checkValidUpdateRequestBody(Map<String, String> requestBody) {
		String message = "";
		
		Boolean isNumberOfParametersPassedValid = requestBody.size() == 2;
		Boolean doesStartDateExist = requestBody.get("startDate") != null && requestBody.get("startDate").length()>1;
		Boolean doesEndDateExist = requestBody.get("endDate") != null && requestBody.get("endDate").length()>1;
		if(!isNumberOfParametersPassedValid) message += "Incorrect Number of Parameters Passed | ";
		if(!doesStartDateExist) message += "Start Date Not Specified or Invalid | ";
		if(!doesEndDateExist) message += "End Date Not Specified or Invalid | ";
		
		return message;
	}
	/**
	 * Check wheather Request Body Sent for Creating Obe is Valid
	 * @param obe
	 * @return
	 */
	public static String checkValidAddRequestBody(Obe obe) {
		String message = "";
		
		Boolean isNamePresent = obe.getObeName() != null && obe.getObeName().length()>1;
		Boolean isStartDatePresent = obe.getStartDate() != null &&  obe.getStartDate().length()>1; 
		Boolean isEndDatePresent = obe.getEndDate() != null && obe.getEndDate().length()>1;
		if(!isNamePresent) message += "Name Not Present or Invalid | ";
		if(!isStartDatePresent) message += "Start Date Not Present of Invalid | ";
		if(!isEndDatePresent) message += "End Date Not Present of Invalid | ";
		
		return message;
	}
	
	public static Boolean checkForNullObjects(Object obj) {
		if(obj==null) return true;
		else return false;
	}
}
