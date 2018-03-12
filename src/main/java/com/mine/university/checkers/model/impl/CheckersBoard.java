package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Piece;
import com.mine.university.checkers.model.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.mine.university.checkers.model.impl.Checkers.AVAILABLE_POSITIONS_COUNT;
import static com.mine.university.checkers.model.impl.Checkers.SKIP_ROWS;
import static com.mine.university.checkers.model.impl.Checkers.TOTAL_ROWS;

/**
 * Implementation of a board for standard pieces game. Basic board has the following view
 *
 *     H  G  F  E  D  C  B  A
 *  8    -1    -1    -1    -1  1
 *  7 -1    -1    -1    -1     2
 *  6    -1    -1    -1    -1  3
 *  5                          4
 *  4                          5
 *  3  1     1     1     1     6
 *  2     1     1     1     1  7
 *  1  1     1     1     1     8
 *     A  B  C  D  E  F  G  H
 *
 *  1 and -1 denotes the weights of your and enemy pieces respectively. There are 32 available
 * positions in general. This implementation uses index of a position. Position enumeration starts
 * from the lower left corer to the right. Equivalently each new row began it's numeration with the
 * most left available position.
 */
public class CheckersBoard implements Board<Point> {

    private final List<Piece<Point>> pieces;

    public CheckersBoard() {
        this.pieces = new ArrayList<>(AVAILABLE_POSITIONS_COUNT);
        initBoard();
    }

    @Override
    public List<Piece<Point>> getPieces() {
        return Collections.unmodifiableList(pieces);
    }

    @Override
    public void reset() {
        //
    }

    private void initBoard() {
        int pieceWeight = 1;
        for (int i = 0; i < TOTAL_ROWS; i++) {
            int start = i % 2 != 0 ? 'A' : 'B';
            for (int j = start; j <= 'H'; j += 2) {
                if (!SKIP_ROWS.contains(i + 1)) {
                    pieces.add(new CheckerPiece(new BoardPoint(i, j), pieceWeight));
                } else {
                    //executes twice but i don't care
                    pieceWeight = -1;
                }
            }
        }
    }
}