package service;

import model.SubjectDto;

public interface GradeService {
    public int getTotalScore(SubjectDto student);
    public double findAverage(double total);
}
