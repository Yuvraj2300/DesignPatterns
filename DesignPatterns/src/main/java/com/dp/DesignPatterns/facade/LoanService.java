package com.dp.DesignPatterns.facade;

import javax.ejb.Stateless;

@Stateless
public class LoanService {
	public boolean checkCreditRating(long id, double amount) {
		return	true;
	}
}
