package com.mine.university.checkers.model.impl;

import com.google.common.collect.Sets;
import com.mine.university.checkers.model.MoveStrategy;

import java.util.Set;

public interface Checkers {

    int PIECES_IN_ROW = 4;

    int AVAILABLE_POSITIONS_COUNT = 32;

    int AVAILABLE_PIECES = 12;

    int TOTAL_ROWS = 8;

    Set<Integer> SKIP_ROWS = Sets.newHashSet(4, 5);

    MoveStrategy REGULAR_CHECKER_MOVE_STRATEGY = null;
}
