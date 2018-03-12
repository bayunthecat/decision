package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Point;

public class CheckerMove implements Move {

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

}