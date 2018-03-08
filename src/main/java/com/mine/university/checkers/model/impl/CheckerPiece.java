package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.Piece;

public class CheckerPiece implements Piece<Integer> {

    private final int position;

    private final double weight;

    public CheckerPiece(int position, int weight) {
        this.position = position;
        this.weight = weight;
    }

    @Override
    public Integer getPosition() {
        return position;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}