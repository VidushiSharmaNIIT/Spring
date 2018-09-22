package com.example.practise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.practise.model.City;
import com.example.practise.service.CityService;

@RestController
public class CityController {
	
	@Autowired
	CityService cityService;
	
	@RequestMapping(value="api/test/cityDetails" , method=RequestMethod.GET)
	public List<City> cityDetail() {
		return cityService.cityDetails();
		
	}
}
