package com.amadeus.sentinel.services;

import java.util.List;
import java.util.Map;

import com.amadeus.sentinel.exceptions.ObeNotFoundException;
import com.amadeus.sentinel.models.Obe;
//import com.amadeus.sentinel.models.ServiceInstance;
/**
 * Services for performing
 * @author sinhas
 *
 */
public interface ObeDataService {
	/**
	 * Fetch Obe based on Name
	 * @param name
	 * @return jsonDto
	 */
	Obe getObeForObeName(String name);
	/**
	 * Fetch All the obe
	 * @return
	 */
	List<Obe> getAllObe();
	/**
	 * Update Obe for the given name
	 * @param obe
	 * @param newData
	 * @return status
	 * @throws ObeNotFoundException
	 */
	Boolean updateObeForName(String obe, Map<String, String> newData) throws ObeNotFoundException;
	/**
	 * Add New Obe
	 * @param jsonDto
	 * @return status
	 */
	Boolean addNewObe(Obe jsonDto);
	//Boolean registerService(ServiceInstance instance);

}