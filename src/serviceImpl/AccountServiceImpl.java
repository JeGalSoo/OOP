package serviceImpl;

import lombok.Getter;
import model.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AccountServiceImpl implements AccountService {
    @Getter
    private static AccountService instance = new AccountServiceImpl();
    List<Account> list;

    private AccountServiceImpl(){
        this.list = new ArrayList<>();
    } //디폴트 생성자를 막음 / 단 앞에 맵 선언 필요

    
    @Override
    public String createAccount(Account ad) {
        int a=0;
        for(int i=0; i< list.size();i++) {
            if (ad.getAccountNumber().equals(list.get(i).getAccountNumber())) {
                System.out.println("asd");
                a = 1;
            }
            }
//        for(Account acd:list){
//            if(acd.getAccountNumber().equals(ad.getAccountNumber())) {
//                a += 1;
//            }
//        }
        if(a!=0){
            System.out.println("sadf");
        } else {
            System.out.println(ad.getAccountNumber() + "계좌가 생성됐습니다.\n " +
                    "잔액은 " + (int) (ad.getBalance()) + "입니다.");
            list.add(ad);
            System.out.println(list);
        }
        return "";
    }
    @Override
    public String deposit(Account ad, Scanner sc) {
        for(Account acd : list){
            if(acd.getAccountNumber().equals(ad.getAccountNumber())){
                System.out.println("입금 금액을 입력하세요");
                double a=sc.nextDouble();
                acd.setBalance(acd.getBalance()+a);
                System.out.println(a + "원 입금이 완료 되었습니다.\n 잔액은 " + acd.getBalance()+ "입니다.");
            }else{
                System.out.println("계좌번호가 다릅니다.");
            }
        }
        return null;
    }

    @Override
    public String withdraw(Account ad, Scanner sc) {
        for(Account acd:list) {
            if (acd.getAccountNumber().equals(ad.getAccountNumber())) {
                System.out.println("출금 금액을 입력하세요");
                int a = sc.nextInt();
                if (acd.getBalance() < a) {
                    System.out.println("잔액이 부족합니다.");
                } else {
                    acd.setBalance(acd.getBalance() - a);
                    System.out.println(a + "원 출금이 완료 되었습니다.\n 잔액은 " + acd.getBalance() + "입니다.");
                }
            }
        }
        return "";
    }

    @Override
    public List<Account> getBalance(Account ad) {
        for(Account acd:list){
            if(acd.getAccountNumber().equals(ad.getAccountNumber())){
                System.out.printf(acd.getAccountNumber()+"의 잔액은 : "+acd.getBalance()+ "원 입니다.");
            }else{
                System.out.println("계좌번호를 틀렸습니다.");
            }
        }
        return null;
    }

    @Override
    public String cancelAccount(Account ad, Scanner sc) {
        for(int i=list.size()-1; i>=0;i--){
            if(list.get(i).getAccountNumber().equals(ad.getAccountNumber())){
                list.remove(i);
                System.out.println(list.get(i)+"계좌가 삭제 되었습니다.");
            }else{
                System.out.println("계좌번호가 틀렸습니다.");
            }
        }
        return "";
    }

    @Override
    public List<Account> getAccounts(Account ad) {
        int count=0;
        for(int i=0; i<list.size();i++){
            if(list.get(i).getAccountHolder().equals(ad.getAccountHolder())){
                System.out.println(list.get(i));
                count+=1;
            }
        }
        System.out.println(count+"개의 계좌를 가지고 있습니다.");
        return null;
    }
}

