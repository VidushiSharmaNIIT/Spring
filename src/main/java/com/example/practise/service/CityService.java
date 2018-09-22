package com.example.practise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.practise.dao.CityDao;
import com.example.practise.model.City;

public interface CityService {

	
public List<City> cityDetails();

}