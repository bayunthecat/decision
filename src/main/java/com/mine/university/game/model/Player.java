package com.mine.university.game.model;

import java.util.UUID;

public interface Player {

    Strategy getStrategy();

    UUID getId();
}