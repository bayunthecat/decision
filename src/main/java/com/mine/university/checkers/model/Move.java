package com.mine.university.checkers.model;

/**
 * An abstraction that provides move of a piece.
 * @param <T> denotes underlying positioning system, whether it's standard two dimensional system or a custom one.
 */
public interface Move<T> {

    T getFrom();

    T getTo();

}