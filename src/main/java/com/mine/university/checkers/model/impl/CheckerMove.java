package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Piece;
import com.mine.university.checkers.model.Point;

import java.util.List;

public class CheckerMove implements Move<Point> {

    private final Point from, to;

    public CheckerMove(Point from, Point to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Point getFrom() {
        return from;
    }

    @Override
    public Point getTo() {
        return to;
    }

    @Override
    public List<Piece<Point>> removedPieces() {
        return null;
    }
}