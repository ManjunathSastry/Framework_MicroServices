package com.amadeus.sentinel.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.amadeus.sentinel.exceptions.ObeNotFoundException;
import com.amadeus.sentinel.models.Obe;
import com.amadeus.sentinel.services.ObeDataService;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Service("obeDataService")
public class ObeDataServiceImpl implements ObeDataService {

	private List<Obe> jsonDtoList = new ArrayList<>(Arrays.asList(new Obe("ABC", "1234", "5678"),
			new Obe("DEF", "91011", "1213"), new Obe("GHI", "141516", "171819")));

	@Override
	public Obe getObeForObeName(String name) {
		return jsonDtoList.stream().filter(obe -> obe.getObeName().equals(name)).findFirst().orElse(null);
	}

	@Override
	public List<Obe> getAllObe() {
		return jsonDtoList;
	}

	@Override
	public Boolean updateObeForName(String obe, Map<String, String> newData) throws ObeNotFoundException {
		Obe obeToBeUpdated = getObeForObeName(obe);

		if (obeToBeUpdated == null) {
			throw new ObeNotFoundException("Obe not present");
		} else {
			obeToBeUpdated.setStartDate(newData.get("startDate"));
			obeToBeUpdated.setEndDate(newData.get("endDate"));
		}
		return true;
	}

	@Override
	public Boolean addNewObe(Obe jsonDto) {
		jsonDtoList.add(jsonDto);
		return true;
	}

//	@Override
//	public Boolean registerService(ServiceInstance instance) {
//		// TODO Auto-generated method stub
//		System.out.println("Registering Service....");
//		String hiturl = "http://172.22.233.172/8761/serviceRegistry/registerService";
//		Boolean status = false;
//		JSONObject json = new JSONObject();
//		
//		json.put("serviceName", instance.getServiceName());
//		json.put("host", instance.getHost());
//		json.put("port", instance.getPort());
//		
//		try {
//			HttpResponse<JsonNode> body = Unirest.put(hiturl).header("accept", "application/json")
//					.header("Content-Type", "application/json").body(json).asJson();
//
//			System.out.println("Status: " + body.getStatus());
//			if (body.getStatus() == 200)
//				status = true;
//			System.out.println("Registeration Successful");
//
//		}
//
//		catch (UnirestException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Unirest Exception Encountered. Unable to register the service!");
//			status = false;
//			
//		}
//
//		return status;
//
//	}
//
}
