package com.mine.university.checkers.game;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Point;

public interface GameSession {

    Board<Point> getCurrentState();

    void submitMove(Move<Point> move);


}