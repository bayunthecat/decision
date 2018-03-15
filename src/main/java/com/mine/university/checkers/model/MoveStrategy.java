package com.mine.university.checkers.model;

import java.util.List;

public interface MoveStrategy<T> {

    /**
     * Returns possible moves from the provided point with the respect to board size.
     * Does not consider positions of enemy pieces but rather an interface that denotes possible move
     * patterns in general. Additionally move strategy parametrized with type, that denotes underlying
     * positioning system, whether it's standard two dimensional x, y defined, or custom one.
     * @param position provided position
     * @return list of hypothetically possible moves (@see {@link Move}) without respect to ally/enemy piece locations.
     */
    List<T> getPossibleMoves(T position);

}