package builder;

import model.SubjectDto;

public class SubjectBuilder {
    private int koreaScore;
    private int englishScore;
    private int mathScore;

    public SubjectBuilder koreaScore(int koreaScore){
        this.koreaScore = koreaScore;
        return this;
    }
    public SubjectBuilder englishScore(int englishScore){
        this.englishScore = englishScore;
        return this;
    }
    public SubjectBuilder mathScore(int mathScore){
        this.mathScore = mathScore;
        return this;
    }

    public SubjectDto build(){
        return new SubjectDto(koreaScore, englishScore, mathScore);
    }
}