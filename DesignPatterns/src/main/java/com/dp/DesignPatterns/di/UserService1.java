package com.dp.DesignPatterns.di;

import javax.inject.Inject;

public class UserService1 {
	
	@Inject
	private	UserDataRepositoryImpl	udr;

	public	void	saveUser(User	user) {
		udr.save(user);
	}
}
