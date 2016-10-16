package com.ms;

import java.net.InetAddress;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cache.annotation.CacheConfig;
@RestController
//@CacheConfig(cacheNames = "Vehicles")
public class VehicleController {

	@RequestMapping(value = "/vehicleservice/vehicleDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	//@Cacheable("getVehicleDetails")
	public Collection<VehicleModel> getVehicleDetails() throws UnknownHostException {
		// TODO Get vehicleList from service
System.out.println("===== inside vehicle details  servers ===========");
		Collection<VehicleModel> vehiclesCollection = generateVehicleList();
		return vehiclesCollection;
	}

	// @RequestMapping(value="/vehicleByBrand", method=RequestMethod.POST,
	// produces=MediaType.APPLICATION_JSON_VALUE)
	//@Cacheable("vehicleByBrand")
	@ResponseBody
	@RequestMapping(value = "/vehicleservice/vehicleByBrand", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VehicleModel> getVehicleByBrand(
			@RequestParam("brand") String brand) throws UnknownHostException {
		System.out.println("VehicleController=====> in getVehicleByBrand method");
		List<VehicleModel> vehiclesList = generateVehicleList();
		List<VehicleModel> vehicleByBrand = new ArrayList<VehicleModel>();
		for (VehicleModel vehicles : vehiclesList) {
			if (vehicles.getBrand() != null
					&& vehicles.getBrand().equalsIgnoreCase(brand)) {
				vehicleByBrand.add(vehicles);
			}
		}

		return vehicleByBrand;
	}

	private List<VehicleModel> generateVehicleList() throws UnknownHostException {
		List<VehicleModel> vehicleList = new ArrayList<VehicleModel>();
		VehicleModel vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("TOYOTA111");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Tacoma");
		vehicleModel1.setModel("Tacoma-7122");
		vehicleList.add(vehicleModel1);
		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("TOYOTA");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-2581");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("TOYOTA");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-2582");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleModel();
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
		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("LEXUS");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-2588");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("LEXUS");
		vehicleModel1.setYear("2016");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-1011");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress());
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("LEXUS");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Corolla");
		vehicleModel1.setModel("Corolla-8555");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress() );
		vehicleList.add(vehicleModel1);

		vehicleModel1.setBrand("SCION");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Tundra");
		vehicleModel1.setModel("Tundra-8533");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress() );
		
		vehicleList.add(vehicleModel1);
		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("SCION");
		vehicleModel1.setYear("2017");
		vehicleModel1.setSeries("Highlander");
		vehicleModel1.setModel("Highlander-2598");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress() );
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("SCION");
		vehicleModel1.setYear("2016");
		vehicleModel1.setSeries("Camry");
		vehicleModel1.setModel("Camry-1011");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress() );
		vehicleList.add(vehicleModel1);

		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("SCION");
		vehicleModel1.setYear("2016");
		vehicleModel1.setSeries("Corolla");
		vehicleModel1.setModel("Corolla-8555");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress() );
		vehicleList.add(vehicleModel1);
		
		
		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("TOYOTA");
		vehicleModel1.setYear("2016");
		vehicleModel1.setSeries("TUNDRA");
		vehicleModel1.setModel("TUNDRA-8555");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress() );
		vehicleList.add(vehicleModel1);
		
		
		vehicleModel1 = new VehicleModel();
		vehicleModel1.setBrand("TOYOTA");
		vehicleModel1.setYear("2015");
		vehicleModel1.setSeries("TUNDRA");
		vehicleModel1.setModel("TUNDRA-8666");
		vehicleModel1.setIpaddr(InetAddress.getLocalHost().getHostAddress() );
		vehicleList.add(vehicleModel1);
		
		
		
		return vehicleList;
	}

	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "My Spring Boot";
	}
	@ResponseBody
	@RequestMapping("/vehicleservice")
	String entryVehicleService() {
		System.out.println("VehicleController=====> in vehicleservice method");
		return "vehicle service";
	}
}
