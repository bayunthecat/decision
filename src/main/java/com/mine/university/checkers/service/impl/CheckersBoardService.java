package com.mine.university.checkers.service.impl;

import com.google.common.collect.Lists;
import com.mine.university.checkers.model.Piece;
import com.mine.university.checkers.model.impl.CheckersBoard;
import com.mine.university.checkers.service.BoardService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.mine.university.checkers.model.impl.Checkers.AVAILABLE_POSITION_COUNT;
import static com.mine.university.checkers.model.impl.Checkers.PIECES_IN_ROW;

public class CheckersBoardService implements BoardService {

    private static final int AVAILABLE_POSITIONS = 32;

    private static final double ZERO_WEIGHT = 0.0d;

    @Override
    public CheckersBoard getAvailableMoves(CheckersBoard board) {
        return null;
    }

    @Override
    public double[] boardAsVector(CheckersBoard board) {
        List<Integer> positions = board.getPieces().stream().map(Piece::getPosition).collect(Collectors.toList());
        List<Piece<Integer>> pieces = board.getPieces();
        double[] vector = new double[32];
        for (int i = 0; i < AVAILABLE_POSITIONS; i++) {
            if (positions.contains(i)) {
                vector[i] = pieces.get(i).getWeight();
            }
        }
        return vector;
    }

    @Override
    public String getBoardAsString(CheckersBoard board) {
        double[] vector = boardAsVector(board);
        StringBuilder builder = new StringBuilder();
        List<Piece<Integer>> pieces = board.getPieces();
        List<Piece<Integer>> copied = Lists.newArrayList(pieces);
        Collections.reverse(copied);
        List<List<String>> boardStringParts = new ArrayList<>();
        boardStringParts.add(getBoardHeader());
        for (int i = 0; i < AVAILABLE_POSITION_COUNT / PIECES_IN_ROW; i++) {
            List<List<String>> rowAsString = new ArrayList<>();

        }
        int pieceCount = 0;
        for (Piece<Integer> piece : copied) {
            pieceCount++;
            boardStringParts.add(null);
        }
        return builder.toString();
    }

    private List<String> getBoardHeader() {
        List<Character> boardHeader = new ArrayList<>();
        //Need leading whitespace to maintain board consistency.
        boardHeader.add(' ');
        for (int i = 'A'; i < 'H'; i++) {
            boardHeader.add((char) i);
        }
        return boardHeader.stream().map(String::valueOf).collect(Collectors.toList());
    }
}