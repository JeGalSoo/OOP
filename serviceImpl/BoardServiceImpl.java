package serviceImpl;

import model.BoardDto;
import service.BoardService;
import service.GradeService;

public class BoardServiceImpl implements BoardService {
    private static BoardService instance = new BoardServiceImpl();
    private BoardServiceImpl(){} //디폴트 생성자를 막음
    public static BoardService getInstance() {
        return instance;
    }


    public String getWriter(BoardDto writer){
        return "";
    }
}
