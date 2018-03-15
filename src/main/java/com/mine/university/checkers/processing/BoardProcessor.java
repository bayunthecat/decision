package com.mine.university.checkers.processing;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Move;

import java.util.List;

public interface BoardProcessor<T> {

    List<Move<T>> getAvailableMoves(Board<T> board);

    double[] boardAsVector(Board<T> board);

}