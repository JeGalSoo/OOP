package controller;

import builder.AccountBuilder;
import model.AccountDto;
import model.UserDto;
import service.AccountService;
import service.UtilService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService as;
    UtilService us;
    public AccountController(){
        this.as=AccountServiceImpl.getInstance();
        this.us= UtilServiceImpl.getInstance();
    }
    public String createAccount(Scanner sc) {
        System.out.println("이름을 입력해 주세요");
        return as.createAccount(new AccountBuilder()
                .accountNumber(String.valueOf(us.createRandomInteger(11111111,99999999)))
                .accountHolder(sc.next())
                .balance(0)
                .transactionDate(null)
                .build());
    }

    public String deposit(Scanner sc) {
        System.out.println("계좌번호를 입력하세요");
        return as.deposit(new AccountBuilder()
                .accountNumber(sc.next())
                .transactionDate(null)
                .build(),sc);
    }

    public String withdraw(Scanner sc) {
        System.out.println("계좌번호를 입력하세요.");
        return as.withdraw(new AccountBuilder()
                .accountNumber(sc.next())
                .transactionDate(null)
                .build(),sc);
    }

    public List<AccountDto> getBalance(Scanner sc) {
        return null;
    }

    public String cancelAccount(Scanner sc) {
        System.out.println("계좌번호와 예금주명을 입력하세요.");
        return as.cancelAccount(new AccountBuilder()
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build(),sc);
    }
    public List<AccountDto> getAccounts(Scanner sc) {
        return null;
    }
}
