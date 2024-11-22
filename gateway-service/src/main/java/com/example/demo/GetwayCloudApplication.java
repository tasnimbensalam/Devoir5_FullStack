package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

@SpringBootApplication
public class GetwayCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetwayCloudApplication.class, args);
	}
	
	@Bean
	   public WebFilter corsFilter() {
	    return (ServerWebExchange ctx, WebFilterChain chain) -> {
	    ctx.getResponse().getHeaders().add("Access-Control-Allow-Origin", "http://localhost:4200");
	    ctx.getResponse().getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
	    ctx.getResponse().getHeaders().add("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization");
	    ctx.getResponse().getHeaders().add("Access-Control-Allow-Credentials", "true"); // Ajouter cette ligne
	    return chain.filter(ctx);
	    };
	   }
    
}
