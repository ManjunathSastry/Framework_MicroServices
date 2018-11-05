package com.amadeus.sentinel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//import com.amadeus.sentinel.models.ServiceInstance;
import com.amadeus.sentinel.services.impl.ObeDataServiceImpl;
/**
 * Entry point for Spring Boot Application
 * @author sinhas
 *
 */
@SpringBootApplication
@ComponentScan("com.amadeus.sentinel")
//@EnableDiscoveryClient
public class SentinelMicroserviceDemoApplication {
	
	
	/**
	 * Entry point of the application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SentinelMicroserviceDemoApplication.class, args);
		ObeDataServiceImpl services = new ObeDataServiceImpl();
		//services.registerService(new ServiceInstance("s1", "localhost", "8080"));
	}
}
