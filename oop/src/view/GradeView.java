package view;
import builder.SubjectBuilder;
import builder.UserBuilder;
import model.SubjectDto;
import model.UserDto;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        UserDto student = new UserBuilder()
                .name(sc.next())
                .build();
        UtilService util = UtilServiceImpl.getInstance();
        SubjectDto subjects = new SubjectBuilder()
                .koreaScore(util.createRandomInteger(0, 100))
                .englishScore(util.createRandomInteger(0, 100))
                .mathScore(util.createRandomInteger(0, 100))
                .build();
        GradeService grade = GradeServiceImpl.getInstance();
        int totalScore = grade.getTotalScore(subjects);
        double average = grade.findAverage(totalScore);
        System.out.printf("성적표\n" +
                        "이름 : %s" + "\n" +
                        "국어 : %s" + "\n" +
                        "영어 : %s\n" +
                        "수학 : %s\n" +
                        "총합 : %s\n" +
                        "평균 : %s\n",
                student.getName(),
                subjects.getKoreaScore(),
                subjects.getEnglishScore(),
                subjects.getMathScore(),
                totalScore,
                String.valueOf(average).substring(0,4));

        System.out.println();

    }
}
