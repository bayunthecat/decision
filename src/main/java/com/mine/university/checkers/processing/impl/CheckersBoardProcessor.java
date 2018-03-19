package com.mine.university.checkers.processing.impl;

import com.mine.university.checkers.model.*;
import com.mine.university.checkers.model.impl.CheckerMove;
import com.mine.university.checkers.model.impl.CheckerPiece;
import com.mine.university.checkers.model.impl.CheckerPieceMoveStrategy;
import com.mine.university.checkers.model.impl.KingPiece;
import com.mine.university.checkers.processing.BoardProcessor;

import java.util.*;
import java.util.stream.Collectors;

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
        Map<Point, Piece<Point>> pieces = board.getPieces()
                .stream()
                .collect(Collectors.toMap(Piece::getPosition, piece -> piece));
        List<Move<Point>> moves = new ArrayList<>();
        board.getPieces().stream()
                .filter(piece -> piece.getWeight() > 0)
                .forEach(piece -> fillAvailableMoves(piece.getPosition(), piece, pieces, moves));
        return moves;
    }

    private void fillAvailableMoves(Point fromPoint, Piece<Point> piece, Map<Point, Piece<Point>> pieces, List<Move<Point>> moves) {
        MoveStrategy<Point> moveStrategy = moveStrategies.get(piece.getClass());
        Objects.requireNonNull(moveStrategy, "Move strategy is null! Probably misconfiguration.");
        List<Point> points = moveStrategy.getPossibleMoves(fromPoint);
        for (Point toPoint : points) {
            Piece<Point> boardPiece = pieces.get(toPoint);
            if (boardPiece != null) {
                fillAvailableMoves(toPoint, piece, pieces, moves);
            } else {
                moves.add(new CheckerMove(fromPoint, toPoint));
            }
        }
    }

    @Override
    public double[] boardAsVector(Board<Point> board) {
        return new double[] {};
    }
}