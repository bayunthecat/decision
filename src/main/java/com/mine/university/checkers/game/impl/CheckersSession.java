package com.mine.university.checkers.game.impl;

import com.mine.university.checkers.game.GameSession;
import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Point;
import com.mine.university.checkers.processing.BoardProcessor;

public class CheckersSession implements GameSession {

    private Board<Point> board;

    private BoardProcessor<Point> boardProcessor;

    @Override
    public Board<Point> getCurrentState() {
        return board;
    }

    @Override
    public void submitMove(Move<Point> move) {
        
    }
}