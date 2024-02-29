package serviceImpl;

import builder.AccountBuilder;
import controller.AccountController;
import lombok.Getter;
import model.AccountDto;
import model.UserDto;
import service.AccountService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl implements AccountService {
    @Getter
    private static AccountService instance = new AccountServiceImpl();
    List<AccountDto> list;
    AccountDto oad;

    private AccountServiceImpl(){
        list = new ArrayList<>();
        oad=new AccountBuilder().build();
    } //디폴트 생성자를 막음 / 단 앞에 맵 선언 필요



    @Override
    public String createAccount(AccountDto ad) {
        while (true) {
            if (ad.getAccountNumber().equals(oad.getAccountNumber())) {
            }else{
                oad.setAccountNumber(ad.getAccountNumber());
                System.out.println(oad.getAccountNumber() + "계좌가 생성됐습니다.\n " +
                        "잔액은 " + (int) (ad.getBalance()) + "입니다.");
                list.add(ad);
                System.out.println(list);
                break;
            }
        }
        return "";
    }
    @Override
    public String deposit(AccountDto ad,Scanner sc) {
//        if(list.)
        {
            System.out.println("입금 금액을 입력하세요");
            int a = sc.nextInt();
            oad.setBalance(oad.getBalance()+a);
            System.out.println(a + "원 입금이 완료 되었습니다.\n 잔액은 " + oad.getBalance() + "입니다.");
        }
        return oad.getBalance()+"";
    }

    @Override
    public String withdraw(AccountDto ad,Scanner sc) {
        if(ad.getAccountNumber().equals(oad.getAccountNumber())) {
            System.out.println("출금 금액을 입력하세요");
            int a = sc.nextInt();
            if(oad.getBalance()<a){
                System.out.println("잔액이 부족합니다.");
            }else{
                oad.setBalance(oad.getBalance()-a);
                System.out.println(a + "원 출금이 완료 되었습니다.\n 잔액은 " + oad.getBalance() + "입니다.");
            }
        }
        return "";
    }

    @Override
    public List<AccountDto> getBalance(AccountDto ad) {

        return null;
    }

    @Override
    public String cancelAccount(AccountDto ad,Scanner sc) {
//        if(ad.getAccountNumber()==oad.getAccountNumber()&&ad.getAccountHolder()==oad.getAccountHolder()){
//            System.out.printf("잔액은 %s원 입니다. 그래도 삭제 하시겠습니까?\n" +
//                    "삭제는 y, 취소는 n을 눌러주세요.",oad.getBalance());
//            if(sc.next().equals("y")){

//            }
//        }
        return "";
    }

    @Override
    public List<AccountDto> getAccounts() {
        return null;
    }
}
