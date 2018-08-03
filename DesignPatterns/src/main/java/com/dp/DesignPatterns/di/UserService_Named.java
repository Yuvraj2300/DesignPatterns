package com.dp.DesignPatterns.di;

import javax.inject.Inject;
import javax.inject.Named;

public class UserService_Named {
	
	/*@Inject
	@Named("UserDataRepforMongo")
	private	UserDataRepository	udr;*/
	
	
	@Inject	@Named
	private	UserDataRepository	UserDataRepforMongo;
	
	public	void	persistUser(User	user) {
		UserDataRepforMongo.save(user);
	}
}
