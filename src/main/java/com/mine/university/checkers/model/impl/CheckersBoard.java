package com.mine.university.checkers.model.impl;

import com.google.common.collect.ImmutableMap;
import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Piece;
import com.mine.university.checkers.model.Point;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.mine.university.checkers.model.impl.Checkers.*;

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

    private final Map<Point, Piece<Point>> pieces;

    public CheckersBoard() {
        this.pieces = new HashMap<>(AVAILABLE_POSITIONS_COUNT);
        initBoard();
    }

    public CheckersBoard(Board<Point> board) {
        this.pieces = new HashMap<>(board.getPointToPiecesMap());
    }

    public CheckersBoard(Map<Point, Piece<Point>> pieces) {
        this.pieces = new HashMap<>(pieces);
    }

    @Override
    public List<Piece<Point>> getPieces() {
        return new ArrayList<>(pieces.values());
    }

    @Override
    public Map<Point, Piece<Point>> getPointToPiecesMap() {
        //think of caching mechanism that encapsulates current state and corresponding map
        return new HashMap<>(pieces);
    }

    private void initBoard() {
        int pieceWeight = 1;
        for (int i = 0; i < TOTAL_ROWS; i++) {
            int start = i % 2 != 0 ? 'B' : 'A';
            for (int j = start; j <= 'H'; j += 2) {
                if (!SKIP_ROWS.contains(i + 1)) {
                    Point point = new BoardPoint(i, j);
                    pieces.put(point, new CheckerPiece(point, pieceWeight));
                } else {
                    //executes twice but i don't care
                    pieceWeight = -1;
                }
            }
        }
    }
}