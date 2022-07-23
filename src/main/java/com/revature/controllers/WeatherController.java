package com.revature.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WeatherController {
	public WeatherController() {
		super();
	}
	
	@GetMapping(value="/weather")
	@ResponseBody
	private Object getWeatherClient(@RequestParam int location) {
		String zipCode = Integer.toString(location);
		String uri = System.getenv("API_URI") + zipCode;
		RestTemplate restTemplate = new RestTemplate();
		Object apiResult = restTemplate.getForObject(uri, Object.class);
		return apiResult;
	}
	
}
