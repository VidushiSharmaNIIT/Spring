package com.example.practise.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.practise.model.Address;
import com.example.practise.model.City;
import com.example.practise.model.DetailOfPeople;
import com.example.practise.service.CityServiceImpl;

public class CityDaoImpl implements CityDao {

public List<City> cityDetails() {
	List<City> data=new ArrayList<>();
			Address add=new Address();
			add.setHno(1);
			add.setRn(2);
			add.setSno(1);
			DetailOfPeople detail=new DetailOfPeople();
			detail.setAddress(add);
			detail.setAge(23);
			detail.setName("vidu");
			detail.setSex("f");
			detail.setWorking(true);
			City city=new City();
			city.setNo_of_people(1);
			city.setDetail_of_people(detail);
			
					data.add(city);
					return data;
		}
}



