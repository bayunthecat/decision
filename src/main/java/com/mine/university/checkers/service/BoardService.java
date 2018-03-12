package com.mine.university.checkers.service;

import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.impl.CheckersBoard;

import java.util.List;

public interface BoardService {

    List<Move> getAvailableMoves(CheckersBoard board);

    double[] boardAsVector(CheckersBoard board);

    String boardAsString(CheckersBoard board);

}