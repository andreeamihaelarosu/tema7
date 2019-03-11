package com.andreearosu.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	
	@Autowired
	private CarService CS;
	
	@RequestMapping("/")
	@ResponseBody
	public Iterable<Car> getAll(){
		//Returns a JSON or XML with the users
		System.out.println("CarController.getAll()");
		return CS.findAllCars();
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(@RequestParam String make, @RequestParam String model, @RequestParam String fuel, @RequestParam String gear) {
		Car c = new Car();
		c.setMake(make);
		c.setModel(model);
		c.setGear(gear);
		c.setFuel(fuel);
		CS.addCar(c);
		return "added";
	}
	
	@RequestMapping("/read")
	@ResponseBody
	public String read(@RequestParam int ID) {
		CS.getCar(ID);
		return "read";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String updateEmail(@RequestParam int ID, @RequestParam String make) {
		Car c = CS.getCar(ID);
		c.setMake(make);
		CS.addCar(c);
		return "updated";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(@RequestParam int ID) {
		CS.deleteCar(ID);
		return "deleted";
	}
}