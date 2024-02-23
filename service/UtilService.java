package service;

public interface UtilService {
    int createRandomInteger(int start, int gapBetweenStarAndEnd);
    double createRandomDouble(double start, double gapBetweenStartAndEnd);
    String createRandomName();
    String createRandomTitle();
    String createRandomContents();

}