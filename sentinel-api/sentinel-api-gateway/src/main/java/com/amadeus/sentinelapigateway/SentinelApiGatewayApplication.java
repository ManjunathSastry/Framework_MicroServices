package com.amadeus.sentinelapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * API Gateway for Automatic Routing of Request through API Gateway
 * 
 * @author sinhas
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SentinelApiGatewayApplication {



	public static void main(String[] args) {
		SpringApplication.run(SentinelApiGatewayApplication.class, args);
	}
}
