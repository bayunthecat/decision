package com.mine.university.game.model;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Point;

public interface DecisionProcessor<B> {

    Move<Point> getNextMove(Board<Point> board, Player player, Strategy<B> strategy);

}