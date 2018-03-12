package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.Point;

import java.util.Objects;

public class BoardPoint implements Point {

    private final int x, y;

    public BoardPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardPoint that = (BoardPoint) o;
        return getX() == that.getX() &&
                getY() == that.getY();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getX(), getY());
    }
}
