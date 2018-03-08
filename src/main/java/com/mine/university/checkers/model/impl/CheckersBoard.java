package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Piece;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implementation of a board for standard pieces game. Basic board has the following view
 *     A  B  C  D  E  F  G  H
 *  1    -1    -1    -1    -1
 *  2 -1    -1    -1    -1
 *  3    -1    -1    -1    -1
 *  4
 *  5
 *  6  1     1     1     1
 *  7     1     1     1     1
 *  8  1     1     1     1
 *
 *  1 and -1 denotes the weights of your and enemy pieces respectively. There are 32 available
 * positions in general. This implementation uses index of a position. Position enumeration starts
 * from the lower left corer to the right. Equivalently each new row began it's numeration with the
 * most left available position.
 */
public class CheckersBoard implements Board<Integer> {

    private final List<Piece<Integer>> pieces;

    public CheckersBoard() {
        this.pieces = new ArrayList<>(Checkers.AVAILABLE_POSITION_COUNT);
        initBoard();
    }

    @Override
    public List<Piece<Integer>> getPieces() {
        return Collections.unmodifiableList(pieces);
    }

    @Override
    public void reset() {
        //
    }

    private void initBoard() {
        int pieceWeight = 1;
        for (int i = 0; i < Checkers.AVAILABLE_POSITION_COUNT; i++) {
            if (i >= Checkers.AVAILABLE_PIECES - 1) {
                pieceWeight = -1;
            }
            pieces.add(i, new CheckerPiece(i, pieceWeight));
        }
    }
}