package com.andreearosu.springBoot;

public interface CarServiceInterface {
	
	public Iterable<Car> findAllCars();
	public void deleteCar(int id);
	public void addCar(Car u);
	public Car getCar(int id);
}

