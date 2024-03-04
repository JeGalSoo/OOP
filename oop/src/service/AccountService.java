package service;

import model.Account;

import java.util.List;
import java.util.Scanner;

public interface AccountService {
        String createAccount(Account ad);
        String deposit(Account ad, Scanner sc);
        String withdraw(Account ad, Scanner sc);
        List<?> getBalance(Account ad);
        String cancelAccount(Account ad, Scanner sc);
        List<?> getAccounts(Account ad);
}