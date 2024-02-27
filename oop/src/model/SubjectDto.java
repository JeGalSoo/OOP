package model;

public class SubjectDto {
    private int id;
    private int koreaScore;
    private int englishScore;
    private int mathScore;

    @Override
    public String toString() {
        return "SubjectDto{" +
                "koreaScore=" + koreaScore +
                ", englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                '}';
    }

    public int getKoreaScore() {
        return koreaScore;
    }

    public void setKoreaScore(int koreaScore) {
        this.koreaScore = koreaScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public SubjectDto(int koreaScore, int englishScore, int mathScore) {
        this.koreaScore = koreaScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
}
