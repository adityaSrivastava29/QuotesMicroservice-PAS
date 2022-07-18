package com.cts.quotesmicroservice.util;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="feignDemo", url="http://localhost:9002/consumermicroservice" )
@Service
public interface FeignServiceUtil {

		@GetMapping("/HealthCheck")
		String getHealthConsumer();
		
		
		@GetMapping("/getQuotes/{id}/{pid}")
		public String getQuotes(@PathVariable int id, @PathVariable int pid);
		
	}
