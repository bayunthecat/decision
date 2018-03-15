package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.MoveStrategy;
import com.mine.university.checkers.model.Point;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class CheckerPieceMoveStrategy implements MoveStrategy<Point> {

    @Override
    public List<Point> getPossibleMoves(Point position) {
        int xSize = Checkers.TOTAL_ROWS, ySize = Checkers.TOTAL_ROWS,
                xPoint = position.getX(), yPoint = position.getY();
        List<Point> possiblePoint = new ArrayList<>();
        //Check north-east
        if (xPoint + 1 <= xSize && yPoint + 1 <= ySize) {
            possiblePoint.add(new BoardPoint(xPoint + 1, yPoint + 1));
        }
        //Check north-west
        if (xPoint - 1 > 0 && yPoint + 1 <= ySize) {
            possiblePoint.add(new BoardPoint(xPoint - 1, yPoint + 1));
        }
        //Check south-east
        if (xPoint + 1 <= xSize && yPoint - 1 > 0) {
            Point to = new BoardPoint(xPoint + 1, yPoint - 1);
            possiblePoint.add(new BoardPoint(xPoint + 1, yPoint - 1));
        }
        //Check south-west
        if (xPoint - 1 > 0 && yPoint - 1 > 0) {
            Point to = new BoardPoint(xPoint - 1, yPoint - 1);
            possiblePoint.add(new BoardPoint(xPoint - 1, yPoint - 1));
        }
        return possiblePoint;
    }
}