package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.MoveStrategy;
import com.mine.university.checkers.model.Point;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class CheckerPieceMoveStrategy implements MoveStrategy<Point> {

    @Override
    public List<Move<Point>> getEligibleMoves(Point position, Board<Point> board) {
        List<Move<Point>> eligibleMoves = new ArrayList<>();

        return eligibleMoves;
    }

    //Ones which does not include attacking
    private List<Move<Point>> getRegularMoves(Point position, Board<Point> board) {
        List<Move<Point>> moves = new ArrayList<>();
        //Check north-east
        int xSize = Checkers.TOTAL_ROWS, ySize = Checkers.TOTAL_ROWS,
                xPoint = position.getX(), yPoint = position.getY();
        if (xPoint + 1 <= xSize && yPoint + 1 <= ySize) {
            Point to = new BoardPoint(xPoint + 1, yPoint + 1);
            Move<Point> move = new CheckerMove(position, to);
            moves.add(move);
        }
        //Check north-west
        if (xPoint - 1 > 0 && yPoint + 1 <= ySize) {
            Point to = new BoardPoint(xPoint - 1, yPoint + 1);
        }
        return moves;
    }

    private List<Move<Point>> getAttackingMoves(Point position) {
        return null;
    }

}