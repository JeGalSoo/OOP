package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main() {
        List<BoardDto> articles = new ArrayList<>();

        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            articles.add(new BoardBuilder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContents())
                    .writer(util.createRandomName())
                    .build());
        }
        for(BoardDto b : articles){
            System.out.println(b.getTitle()+"\t"+
                    b.getContent()+"\t"+
                    b.getWriter());
        }
        articles.forEach(i -> { //i는 의미없이 쓰여진 문구, articles는 메모리 점유x
            System.out.println(i.toString());
        });
    }
}
