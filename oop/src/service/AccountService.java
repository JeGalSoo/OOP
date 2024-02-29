package service;

import controller.AccountController;
import model.AccountDto;

import java.util.List;
import java.util.Scanner;

public interface AccountService {
        String createAccount(AccountDto ad);
        String deposit(AccountDto ad,Scanner sc);
        String withdraw(AccountDto ad,Scanner sc);
        List<AccountDto> getBalance(AccountDto ad);
        String cancelAccount(AccountDto ad,Scanner sc);
        List<AccountDto> getAccounts();
}
