package com.mine.university.checkers.processing.impl;

import com.mine.university.checkers.model.*;
import com.mine.university.checkers.model.impl.CheckerPiece;
import com.mine.university.checkers.model.impl.CheckerPieceMoveStrategy;
import com.mine.university.checkers.model.impl.KingPiece;
import com.mine.university.checkers.processing.BoardProcessor;

import java.util.*;

public class CheckersBoardProcessor implements BoardProcessor<Point> {

    private Map<Class<?>, MoveStrategy<Point>> moveStrategies;

    public CheckersBoardProcessor() {
        //move to separate config class
        this.moveStrategies = new HashMap<>();
        moveStrategies.put(CheckerPiece.class, new CheckerPieceMoveStrategy());
        //replace with separate move strategy for king
        moveStrategies.put(KingPiece.class, new CheckerPieceMoveStrategy());
    }

    @Override
    public List<Move<Point>> getAvailableMoves(Board<Point> board) {
        Map<Point, Piece<Point>> pieces = board.getPointToPiecesMap();
        List<Move<Point>> moves = new ArrayList<>();
        pieces.forEach(((point, piece) -> {

        }));
        return moves;
    }

    private void fillMoves(Piece<Point> piece, Board<Point> board, List<Move<Point>> moves) {
        MoveStrategy<Point> strategy = moveStrategies.get(piece.getClass());
        Objects.requireNonNull(strategy, "Strategy is null! Probably a mis configuration.");

    }

    @Override
    public double[] boardAsVector(Board<Point> board) {
        return new double[] {};
    }
}