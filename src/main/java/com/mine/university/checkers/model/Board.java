package com.mine.university.checkers.model;

import java.util.List;
import java.util.Map;

public interface Board<T> {

    List<Piece<T>> getPieces();

    Map<T, Piece<T>> getPointToPiecesMap();
}