package com.ms;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//import io.pivotal.microservices.accounts.AccountRepository;
//import io.pivotal.microservices.accounts.AccountsConfiguration;

/**
 * Run as a micro-service, registering with the Discovery Server (Eureka).
 * <p>
 * Note that the configuration for this application is imported from
 * {@link AccountsConfiguration}. This is a deliberate separation of concerns.
 * 
 * @author Paul Chapman
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
//@EnableDiscoveryClient
//@EnableHystrix   ////////////////
//@Import(AccountsConfiguration.class)
public class VehicleInventoryServer {

	@Autowired
	protected VehicleInventoryController vehicleInventoryController;
//	
//
//	@Autowired
//	protected VehicleInventoryController vehicleInventoryController;
//
//	
	protected Logger logger = Logger.getLogger(VehicleInventoryServer.class.getName());

	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 * 
	 * @param args
	 *            Program arguments - ignored.
	 */
	public static void main(String[] args) {
		// Tell server to look for accounts-server.properties or
		// accounts-server.yml
		System.setProperty("spring.config.name", "allvehicles");
//		System.setProperty("http.proxyHost", "INSTPISA2.in.corp.sa");
//		System.setProperty("http.proxyPort", "8080");
//		System.setProperty("https.proxyHost", "INSTPISA2.in.corp.sa");
//		System.setProperty("https.proxyPort", "8080");

		SpringApplication.run(VehicleInventoryServer.class, args);
	}
}
