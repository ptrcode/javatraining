package com.ms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class VehicleInventoryController {

	@RequestMapping(value = "/vehicleinventory/vehicleInventoryDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<VehicleInventoryModel>> getVehicleDetails()
			throws UnknownHostException {

		Collection<VehicleInventoryModel> vehiclesCollection = generateVehicleList();
		return new ResponseEntity<Collection<VehicleInventoryModel>>(
				vehiclesCollection, HttpStatus.OK);
	}

	@RequestMapping(value = "/vehicleinventory/vehicleInventory", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<VehicleInventoryModel>> getVehicleByYearSeries(
			@RequestParam("year") String year,
			@RequestParam("series") String series) throws UnknownHostException {

		List<VehicleInventoryModel> vehiclesList = generateVehicleList();
		List<VehicleInventoryModel> vehicleByBrand = new ArrayList<VehicleInventoryModel>();
		for (VehicleInventoryModel vehicles : vehiclesList) {
			if (vehicles.getYear() != null && year != null
					&& vehicles.getYear().equalsIgnoreCase(year)
					&& series != null && vehicles.getSeries() != null
					&& vehicles.getSeries().equalsIgnoreCase(series)) {
				vehicleByBrand.add(vehicles);
			}
		}
		return new ResponseEntity<List<VehicleInventoryModel>>(vehicleByBrand,
				HttpStatus.OK);
	}

	private List<VehicleInventoryModel> generateVehicleList()
			throws UnknownHostException {
		List<VehicleInventoryModel> vehicleList = new ArrayList<VehicleInventoryModel>();
		VehicleInventoryModel vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("TOYOTA111");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Tacoma");
		vehicleModel1.setModel("Tacoma-7122");
		vehicleList.add(vehicleModel1);
		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("TOYOTA");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-2581");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("TOYOTA");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-2582");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("TOYOTA");
		vehicleModel1.setYear("2016");
		vehicleModel1.setSeries("Corolla");
		vehicleModel1.setModel("Corolla-1781");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1.setBrand("LEXUS");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Tacoma");
		vehicleModel1.setModel("Tacoma-8533");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);
		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("LEXUS");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-2588");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("LEXUS");
		vehicleModel1.setYear("2016");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-1011");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("LEXUS");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Corolla");
		vehicleModel1.setModel("Corolla-8555");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1.setBrand("SCION");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Tundra");
		vehicleModel1.setModel("Tundra-8533");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());

		vehicleList.add(vehicleModel1);
		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("SCION");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Highlander");
		vehicleModel1.setModel("Highlander-2598");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("SCION");
		vehicleModel1.setYear("2016");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-1011");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("SCION");
		vehicleModel1.setYear("2016");
		vehicleModel1.setSeries("Corolla");
		vehicleModel1.setModel("Corolla-8555");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("TOYOTA");
		vehicleModel1.setYear("2016");
		vehicleModel1.setSeries("TUNDRA");
		vehicleModel1.setModel("TUNDRA-8555");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleInventoryModel();
		vehicleModel1.setBrand("TOYOTA");
		vehicleModel1.setYear("2015");
		vehicleModel1.setSeries("TUNDRA");
		vehicleModel1.setModel("TUNDRA-8666");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);
		return vehicleList;
	}

	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "My spring Root";
	}
	@ResponseBody
	@RequestMapping("/vehicleinventory")
	String entryVehicleInventory() {
		return "vehicle inventory";
	}
}
