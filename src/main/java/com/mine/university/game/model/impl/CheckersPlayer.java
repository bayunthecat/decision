package com.mine.university.game.model.impl;

import com.mine.university.game.model.Player;
import com.mine.university.game.model.Strategy;

import java.util.UUID;

public class CheckersPlayer implements Player {

    private UUID id;

    private Strategy strategy;

    public CheckersPlayer(Strategy strategy) {
        id = UUID.randomUUID();
        this.strategy = strategy;
    }

    @Override
    public Strategy getStrategy() {
        return strategy;
    }

    @Override
    public UUID getId() {
        return id;
    }
}
