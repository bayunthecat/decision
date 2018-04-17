package com.mine.university.game.model;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Point;

import java.util.List;

public interface Strategy {

    double evaluateBoard(Board<Point> board);

    double[] evaluateBoards(List<Board<Point>> boardList);

}