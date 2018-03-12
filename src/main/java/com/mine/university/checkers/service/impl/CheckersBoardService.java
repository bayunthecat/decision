package com.mine.university.checkers.service.impl;

import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Piece;
import com.mine.university.checkers.model.Point;
import com.mine.university.checkers.model.impl.BoardPoint;
import com.mine.university.checkers.model.impl.CheckersBoard;
import com.mine.university.checkers.service.BoardService;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.mine.university.checkers.model.impl.Checkers.TOTAL_ROWS;

public class CheckersBoardService implements BoardService {

    private static final String EMPTY_ELEMENT = "   ";

    @Override
    public List<Move> getAvailableMoves(CheckersBoard board) {
        List<Piece<Point>> pieces = board.getPieces();
        List<Move> moves = new ArrayList<>();
        pieces.stream().forEach(piece -> {

        });
        return moves;
    }

    @Override
    public double[] boardAsVector(CheckersBoard board) {
        return new double[] {};
    }

    @Override
    public String boardAsString(CheckersBoard board) {
        Map<Point, Piece<Point>> pieces = board.getPieces()
                .stream()
                .collect(Collectors.toMap(Piece::getPosition, piece -> piece));
        List<List<String>> rows = new ArrayList<>();
        rows.add(getBoardHeader());
        for (int i = 0; i < TOTAL_ROWS; i++) {
            List<String> row = new ArrayList<>();
            row.add(StringUtils.SPACE + String.valueOf(i + 1) + StringUtils.SPACE);
            for (int j = 'A'; j <= 'H'; j++) {
                Point point = new BoardPoint(i, j);
                if (pieces.containsKey(point)) {
                    Piece<Point> piece = pieces.get(point);
                    row.add(weightAsString(piece.getWeight()));
                } else {
                    row.add(EMPTY_ELEMENT);
                }
            }
            row.add(StringUtils.SPACE + String.valueOf(TOTAL_ROWS - i));
            rows.add(row);
        }
        List<String> boardHeader = getBoardHeader();
        Collections.reverse(boardHeader);
        rows.add(boardHeader);
        StringBuilder builder = new StringBuilder();
        Collections.reverse(rows);
        for (List<String> row : rows) {
            builder.append(String.join(StringUtils.EMPTY, row)).append(System.lineSeparator());
        }
        return builder.toString();
    }

    private String weightAsString(double weight) {
        if (weight != 1 && weight != -1) {
            return weight >= 0 ? " K " : "-K ";
        } else {
            return weight >= 0 ? " 1 " : "-1 ";
        }
    }

    private List<String> getBoardHeader() {
        List<Character> boardHeader = new ArrayList<>();
        //Need leading whitespace to maintain board consistency.
        boardHeader.add(' ');
        for (int i = 'A'; i <= 'H'; i++) {
            boardHeader.add((char) i);
        }
        boardHeader.add(' ');
        return boardHeader.stream().map(character -> StringUtils.SPACE + String.valueOf(character) + StringUtils.SPACE).collect(Collectors.toList());
    }
}