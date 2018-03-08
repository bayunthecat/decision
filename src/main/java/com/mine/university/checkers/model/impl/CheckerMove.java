package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Piece;

public class CheckerMove implements Move<Integer> {

    private final Piece<Integer> from, to;

    public CheckerMove(Piece<Integer> from, Piece<Integer> to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Piece<Integer> getFrom() {
        return from;
    }

    @Override
    public Piece<Integer> getTo() {
        return to;
    }

}