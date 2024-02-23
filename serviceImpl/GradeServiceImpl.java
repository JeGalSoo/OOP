package serviceImpl;

import model.SubjectDto;
import service.GradeService;
import service.UtilService;
import view.GradeView;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();
    private GradeServiceImpl(){} //디폴트 생성자를 막음
    public static GradeService getInstance() {
        return instance;
    }
    @Override
    public int getTotalScore(SubjectDto student) {
        int total = student.getKoreaScore()+student.getEnglishScore()+student.getMathScore();
        return total;
    }

    @Override
    public double findAverage(double total) {
        double avg = total/3;
        return avg;
    }
}
