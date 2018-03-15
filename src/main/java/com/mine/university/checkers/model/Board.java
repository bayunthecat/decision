package com.mine.university.checkers.model;

import java.util.List;

public interface Board<T> {

    List<Piece<T>> getPieces();
}