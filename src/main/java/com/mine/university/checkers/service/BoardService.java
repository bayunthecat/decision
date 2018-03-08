package com.mine.university.checkers.service;

import com.mine.university.checkers.model.impl.CheckersBoard;

public interface BoardService {

    CheckersBoard getAvailableMoves(CheckersBoard board);

    double[] boardAsVector(CheckersBoard board);

    String getBoardAsString(CheckersBoard board);

}