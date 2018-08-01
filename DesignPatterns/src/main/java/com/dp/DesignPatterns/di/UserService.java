package com.dp.DesignPatterns.di;

public class UserService {
	private	UserDataRepository	udr;
	
	UserService(UserDataRepositoryImpl	udr){
		this.udr=udr;
	}
	
	public	void	persistUser(User	user) {
		udr.save(user);
	}
}
