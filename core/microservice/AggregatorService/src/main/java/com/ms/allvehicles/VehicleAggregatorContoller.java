package com.ms.allvehicles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//import com.ms.VehicleInventoryModel;

@RestController
public class VehicleAggregatorContoller {

	// @Autowired
	// RestTemplate restTemplate;

	// http://services.efcproject.com:8082/vehicleInventory?year=2017&series=Tacoma
	// http://services.efcproject.com:8083/vehicleByBrand?brand=TOYOTA
	// http://services.efcproject.com:8083/vehicleDetails
	// http://services.efcproject.com:8082/vehicleInventoryDetails

	@RequestMapping(method = RequestMethod.GET, value = "/vehicleInventoryDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	Collection<VehicleInventoryModel> getVehicleInventoryDetails() {

		String url = "http://services.efcproject.com:8082/vehicleInventoryDetails";

		RestTemplate restTemplate = new RestTemplate();
		return (Collection<VehicleInventoryModel>) restTemplate.getForObject(
				url, Collection.class);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/vehicleInventory", produces = MediaType.APPLICATION_JSON_VALUE)
	Collection<VehicleInventoryModel> getVehicleByYearSeries(
			@RequestParam("year") String year,
			@RequestParam("series") String series) {
		String url = "http://services.efcproject.com:8082/vehicleinventory/vehicleInventory?year="
				+ year + "&series=" + series;
		RestTemplate restTemplate = new RestTemplate();
		return (Collection<VehicleInventoryModel>) restTemplate.getForObject(
				url, Collection.class);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/aggregate/allvehicles", produces = MediaType.APPLICATION_JSON_VALUE)
	List<VehicleInventoryModel> getAggregateData(
			@RequestParam(required=false,value="year") String year,
			@RequestParam(required=false,value="series") String series,
			@RequestParam(required=false,value = "brand") String brand) {

		if (brand != null && year == null && series == null) { // only brand

			String url = "http://services.efcproject.com:8083/vehicleservice/vehicleByBrand?brand=" + brand;
			RestTemplate restTemplate = new RestTemplate();

			return (List) restTemplate.getForObject(url, List.class);

		} else if (brand == null && year != null && series != null) {
			// year andseries

			String url = "http://services.efcproject.com:8082/vehicleinventory/vehicleInventory?year=" + year
					+ "&series=" + series;
			RestTemplate restTemplate = new RestTemplate();
			return (List) restTemplate.getForObject(url, List.class);

		} else if (year != null && series != null && brand != null) { // ALL

			String url = "http://services.efcproject.com:8082/vehicleinventory/vehicleInventory?year=" + year
					+ "&series=" + series;
			RestTemplate restTemplate = new RestTemplate();
			List<LinkedHashMap<String, Object>> usersMap = restTemplate
					.getForObject(url, List.class);

			List<VehicleInventoryModel> vehicleByBrand = new ArrayList<VehicleInventoryModel>();

			if (usersMap != null) {
				for (LinkedHashMap<String, Object> map : usersMap) {
					if (((String) map.get("brand")).equalsIgnoreCase(brand)
							&& ((String) map.get("year"))
									.equalsIgnoreCase(year)
							&& ((String) map.get("series"))
									.equalsIgnoreCase(series)) {

						VehicleInventoryModel model = new VehicleInventoryModel();
						model.setBrand((String) map.get("brand"));
						model.setModel((String) map.get("model"));
						model.setSeries((String) map.get("series"));
						model.setYear((String) map.get("year"));
						model.setImageName((String) map.get("brand") + "_"  +map.get("year").toString() +".jpeg");
						vehicleByBrand.add(model);
					}
					System.out.println("  year=" + map.get("year")
							+ ", series=" + map.get("series") + ", brand="
							+ map.get("brand") + ", model=" + map.get("model"));
				}
			}
 
			return vehicleByBrand;

		}
		return null;
	}
}
