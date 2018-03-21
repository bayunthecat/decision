package com.mine.university.checkers.model.impl;

import com.google.common.collect.Lists;
import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Piece;
import com.mine.university.checkers.model.Point;

import java.util.Collections;
import java.util.List;

public class CheckerMove implements Move<Point> {

    private final Point from, to;

    private final List<Piece<Point>> removedPieces = Lists.newArrayList();

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
        return Collections.unmodifiableList(removedPieces);
    }

    @Override
    public void addPieceToRemove(Piece<Point> piece) {
        removedPieces.add(piece);
    }
}