package com.cts.quotesmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.quotesmicroservice.util.FeignServiceUtil;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class QuotesController {

	@Autowired
	FeignServiceUtil feignServiceUtil;
	
	
	@GetMapping("/getquoteconHealth")
	public String getQuotesForPolicy() {
		return feignServiceUtil.getHealthConsumer();
	
	}
	
	
	
	@GetMapping("/HealthCheckQuote")
	public String getHealthQuote() {
		return "Quote Policy Helth fine";
	
	}
	
	
	@GetMapping("/getQuotesForPolicy/{id}/{pid}")
	public String getQuotesForPolicy(@PathVariable int id,@PathVariable int pid) {
		log.info("Start Get Quotes For Policy inside Quotes Controller");
		String result  = feignServiceUtil.getQuotes(id,pid);
		log.info("QuotesMaster: {}", result);
		
		log.info("End Get Quotes For Policy inside Quotes Controller");
		return  result;

		
	}
	
	
	
}
