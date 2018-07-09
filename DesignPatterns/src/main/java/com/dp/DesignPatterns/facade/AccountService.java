package com.dp.DesignPatterns.facade;

import javax.ejb.Stateless;

@Stateless
public class AccountService {
	public	boolean	getLoan(double	amount) {
		return	true;
	}
	
	public	boolean	setCustBalance(long	id,double	amount) {
		return	true;
	}
}
