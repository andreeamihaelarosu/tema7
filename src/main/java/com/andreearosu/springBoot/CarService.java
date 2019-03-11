package com.andreearosu.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService implements CarServiceInterface{

	@Autowired
	private CarRepository CR;
	
	@Override
	public Iterable<Car> findAllCars(){
		return CR.findAll();
	}
	
	@Override
	public void addCar(Car u){
		CR.save(u);
	}
	
	@Override
	public void deleteCar(int id) {
		CR.deleteById(id);
	}
	
	@Override
	public Car getCar(int id) {
		Car temp = null;
		try {
			temp = CR.findById(id).get();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return temp;
	}

}