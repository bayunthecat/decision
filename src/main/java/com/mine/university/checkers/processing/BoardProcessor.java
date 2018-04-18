package com.mine.university.checkers.processing;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Point;

import java.util.List;

public interface BoardProcessor<T> {

    List<Move<T>> getAvailableMoves(Board<T> board);

    double[] boardAsVector(Board<T> board);

    Board<T> applyMove(Board<T> board, Move<T> move);

    List<Board<T>> formParentBoards(Board<T> board, List<Move<T>> move);
}