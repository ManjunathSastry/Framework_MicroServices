package com.amadeus.sentineldiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

/**
 * Service Discovery Server for Sentinel
 * 
 * @author sinhas
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SentinelDiscoveryServerApplication {


	public static void main(String[] args) {
		SpringApplication.run(SentinelDiscoveryServerApplication.class, args);
	}
}
