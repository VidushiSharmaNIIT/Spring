package com.example.practise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.practise.dao.CityDao;
//import com.example.practise.model.City;
import com.example.practise.model.City;

public class CityServiceImpl implements CityService {

@Autowired
CityDao cityDao;

public List<City> cityDetails() {
	return cityDao.cityDetails();
}
	
}
