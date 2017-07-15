package edu.viggi.learning.spring.cloud;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import edu.viggi.learning.spring.cloud.controllers.ConsumerControllerClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootVariantAmain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringBootVariantAmain.class, args);
		
		ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
		
		System.out.println(consumerControllerClient);
		try {
			consumerControllerClient.getEmployee();
		} catch (RestClientException | IOException e) {
			
			e.printStackTrace();
		}

	}
	
	@Bean
	public  ConsumerControllerClient  consumerControllerClient()
	{
		return  new ConsumerControllerClient();
	}

}
