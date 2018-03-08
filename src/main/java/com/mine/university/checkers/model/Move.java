package com.mine.university.checkers.model;

public interface Move<T> {

    Piece<T> getFrom();

    Piece<T> getTo();

}