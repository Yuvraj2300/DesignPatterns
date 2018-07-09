package com.dp.DesignPatterns.facade;

import javax.ejb.Stateless;

@Stateless
public class CustomerService {
	public	long	getCustomerid(int	sessionid) {
		return	100005L;
	}
	
	public	boolean	checkId(long	id) {
		return	true;
	}
}
