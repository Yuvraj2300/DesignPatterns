package com.dp.DesignPatterns.di;

import javax.inject.Named;

@Named("UsedDataRepforMongo")
public class UserDataRepforMongo implements	UserDataRepository{
	public	void	save(User	user) {
		//persistence code....
	}
}
