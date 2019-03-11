package com.andreearosu.springBoot;

public interface UserServiceInterface {
	
	public Iterable<User> findAllUsers();
	public void deleteUser(int id);
	public void addUser(User u);
	public User getUser(int id);
}

