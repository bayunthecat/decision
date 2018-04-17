package com.mine.university.checkers.processing.impl;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Piece;
import com.mine.university.checkers.model.Point;
import com.mine.university.checkers.model.impl.BoardPoint;
import com.mine.university.checkers.model.impl.CheckerMove;
import com.mine.university.checkers.model.impl.CheckersBoard;
import com.mine.university.checkers.processing.BoardProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckersBoardProcessorTest {

    private BoardProcessor<Point> boardProcessor;

    private Board<Point> board;

    @BeforeEach
    public void beforeEach() {
        board = new CheckersBoard();
        boardProcessor = new CheckersBoardProcessor();
    }

    @Test
    public void testApplyMoveWithoutRemovedPieces() {
        Point newPoint = new BoardPoint(3, 'B');
        Move<Point> move = new CheckerMove(new BoardPoint(2, 'A'), newPoint);
        boardProcessor.applyMove(board, move);
        Map<Point, Piece<Point>> map = board.getPointToPiecesMap();
        Piece<Point> movedPiece = map.get(newPoint);
        assertEquals(newPoint, movedPiece.getPosition());
    }
}