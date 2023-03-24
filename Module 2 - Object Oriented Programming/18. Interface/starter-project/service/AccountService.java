package service;

import java.math.BigDecimal;

import repository.AccountRepository;

public interface AccountService {
    public void deposit(String id, BigDecimal money);

    public void withdraw(String id, BigDecimal money);
    
    
}