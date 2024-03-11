package controller;

import model.Account;
import service.AccountService;
import service.UtilService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService as;
    UtilService us;
    Date transactionDate;
    public AccountController(){
        this.as=AccountServiceImpl.getInstance();
        this.us= UtilServiceImpl.getInstance();
        transactionDate = new Date();
    }
    public String createAccount(Scanner sc) {
        System.out.println("이름을 입력해 주세요");
        return as.createAccount(Account.builder()
                .accountNumber(String.valueOf(us.createRandomInteger(1,3)))
                .accountHolder(sc.next())
                .balance(0)
                .transactionDate(transactionDate)
                .build());
    }

    public String deposit(Scanner sc) {
        System.out.println("계좌번호를 입력하세요");
        return as.deposit(Account.builder()
                .accountNumber(sc.next())
                .transactionDate(transactionDate)
                .build(),sc);
    }

    public String withdraw(Scanner sc) {
        System.out.println("계좌번호를 입력하세요.");
        return as.withdraw(Account.builder()
                .accountNumber(sc.next())
                .transactionDate(transactionDate)
                .build(),sc);
    }

    public List<?> getBalance(Scanner sc) {
        return as.getBalance(Account.builder()
                .accountNumber(sc.next())
                .build());
    }

    public String cancelAccount(Scanner sc) {
        System.out.println("계좌번호와 예금주명을 입력하세요.");
        return as.cancelAccount(Account.builder()
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .transactionDate(transactionDate)
                .build(),sc);
    }
    public List<?> getAccounts(Scanner sc) {
        return as.getAccounts(Account.builder()
                .accountHolder(sc.next())
                .build());
    }
}
