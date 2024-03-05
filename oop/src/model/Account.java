package model;
import lombok.*;
import java.util.Date;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString(exclude = {"id"})
public class Account {
        private long id;
        private String accountNumber;
        private String accountHolder;
        private double balance;
        private Date transactionDate;
        @Builder(builderClassName = "builder")//빌더의 이름을 내가 지정한 것
        public Account(long id, String accountNumber, String accountHolder, double balance, Date transactionDate) {
                this.id = id;
                this.accountNumber = accountNumber;
                this.accountHolder = accountHolder;
                this.balance = balance;
                this.transactionDate = transactionDate;
        }
}
