package com.dp.DesignPatterns;

import javax.inject.Inject;

import com.dp.DesignPatterns.facade.AccountService;
import com.dp.DesignPatterns.facade.CustomerService;
import com.dp.DesignPatterns.facade.LoanService;

public class BankServiceFacade {
	@Inject
	CustomerService	customerService;
	
	@Inject
	AccountService	accountService;
	
	@Inject
	LoanService	loanService;
	
	public	boolean	getLoan(int	sessionId,double	amount) {
		boolean	result	=	false;
		long	id	=	customerService.getCustomerid(sessionId);
		
		if(customerService.checkId(id)) {
			if(loanService.checkCreditRating(id, amount)) {
				if(accountService.getLoan(amount)) {
					result	=	accountService.setCustBalance(id, amount);
				}
			}
		}
		return	result;
	}
	
}
