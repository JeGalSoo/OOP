package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

enum Grade{
    A(9, i->i>=9),
    B(8, i->i>=8),
    C(7, i->i>=7),
    D(6, i->i>=6),
    E(5, i->i>=5),
    F(4, i->i<5)
    ;
    private final int score;
    private Predicate<Integer> predicate;

    Grade(int score,Predicate<Integer> predicate) {
        this.score = score;
        this.predicate=predicate;
    }
    public static Grade getOperator(int a){
            return Arrays.stream(values())
                    .filter(o -> o.score==a)
                    .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }
}

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Grade.getOperator(sc.nextInt()/10));
        //----------------------------------------------------------------
//        switch(sc.nextInt()/10){
//            case 9:
//                System.out.println("A");break;
//            case 8:
//                System.out.println("B");break;
//            case 7:
//                System.out.println("C");break;
//            default:
//                System.out.println("D");break;
//        }
    }
}