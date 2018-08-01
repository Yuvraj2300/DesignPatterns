package com.dp.DesignPatterns.di;

public class UserServiceFactory {
	public	UserService	getInstance() {
		return	new	UserService(new	UserDataRepositoryImpl());
	}
}
