package com.mine.university.checkers.service.impl;

import com.mine.university.checkers.model.impl.CheckersBoard;
import com.mine.university.checkers.service.BoardService;
import org.junit.Test;

public class CheckersBoardServiceTest {

    private BoardService boardService = new CheckersBoardService();

    @Test
    public void testBoardAsString() {
        CheckersBoard board = new CheckersBoard();
        String boardAsString = boardService.boardAsString(board);
        System.out.println(boardAsString);
    }
}