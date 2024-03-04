package service;

import model.Subject;

public interface GradeService {
    public int getTotalScore(Subject student);
    public double findAverage(double total);
}
