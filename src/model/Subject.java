package model;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = {"id"})
public class Subject {
    private int id;
    private int koreaScore;
    private int englishScore;
    private int mathScore;

    @Builder(builderClassName = "builder")
    public Subject(int koreaScore, int englishScore, int mathScore) {
        this.koreaScore = koreaScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
}
