package com.andreearosu.springBoot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService US;
	
	@RequestMapping("/")
	@ResponseBody
	public Iterable<User> getAll(){
		//Returns a JSON or XML with the users
		System.out.println("UserController.getAll()");
		return US.findAllUsers();
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String pswd) {
		User u = new User();
		u.setFirstName(firstName);
		u.setLastName(lastName);
		u.setEmail(email);
		u.setPswd(pswd);
		US.addUser(u);
		return "added";
	}
	
	@RequestMapping("/read")
	@ResponseBody
	public String read(@RequestParam int ID) {
		US.getUser(ID);
		return "read";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String updateEmail(@RequestParam int ID, @RequestParam String email) {
		User u =US.getUser(ID);
		u.setEmail(email);
		US.addUser(u);
		return "updated";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(@RequestParam int ID) {
		US.deleteUser(ID);
		return "deleted";
	}
}