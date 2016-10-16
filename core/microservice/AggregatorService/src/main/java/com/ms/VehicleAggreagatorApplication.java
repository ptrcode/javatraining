package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author Skunchala
 *
 */

@SpringBootApplication
@ComponentScan({"com.ms.allvehicles","com.ms.bybrand"})
public class VehicleAggreagatorApplication 
{

	

	public static void main(String[] args) {
//		 System.setProperty("http.proxyHost", "INSTPISA2.in.corp.sa");
//		 System.setProperty("http.proxyPort", "8080");
//		 System.setProperty("https.proxyHost", "INSTPISA2.in.corp.sa");
//		 System.setProperty("https.proxyPort", "8080");
		// Tell server to look for registration.properties or registration.yml

		SpringApplication.run(VehicleAggreagatorApplication.class, args);
	}

}
