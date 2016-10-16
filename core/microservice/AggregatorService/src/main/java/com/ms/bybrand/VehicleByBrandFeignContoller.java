package com.ms.bybrand;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ms.allvehicles.VehicleInventoryModel;
import com.ms.bybrand.VehicleModel;

@RestController
public class VehicleByBrandFeignContoller {
//	@Autowired
//	RestTemplate restTemplate;

	@RequestMapping(method = RequestMethod.GET, value = "/vehicleDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	Collection<VehicleModel> getVehicleDetails() {
		
		
		// http://localhost:8083/vehicleByBrand?brand=TOYOTA
		RestTemplate restTemplate=new RestTemplate();
		String url = "http://localhost:8083/vehicleDetails";

		return (Collection<VehicleModel>) restTemplate.getForObject(
				url, Collection.class);
	}

	// VEHICLE DETAIL SERVICES
	@RequestMapping(method = RequestMethod.GET, value = "/vehicleByBrand", produces = MediaType.APPLICATION_JSON_VALUE)
	List<VehicleModel> getVehicleByBrand(
			@RequestParam(value = "brand") String brand) {
		String url = "http://localhost:8083/vehicleByBrand?brand="+brand;

		RestTemplate restTemplate=new RestTemplate();
		
		return (List<VehicleModel>) restTemplate.getForObject(
				url, List.class);
	}

}











