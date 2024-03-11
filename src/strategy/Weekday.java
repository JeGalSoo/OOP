package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;

    enum Weeks {
        sun {
            @Override
            public String w() {
                return "일요일";
            }
        },
        mon {
            @Override
            public String w() {
                return "월요일";
            }
        },
        tue {
            @Override
            public String w() {
                return "화요일";
            }
        },
        wen {
            @Override
            public String w() {
                return "수요일";
            }
        },
        thi {
            @Override
            public String w() {
                return "목요일";
            }
        },
        fri {
            @Override
            public String w() {
                return "금요일";
            }
        },
        sat {
            @Override
            public String w() {
                return "토요일";
            }
        };

        public abstract String w();
    }

public class Weekday{
    public static String weekday(Weeks week){
        return week.w();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Weekday.weekday(Weeks.valueOf(sc.next())));
    }
}
