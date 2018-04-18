package com.mine.university.game.model.impl;

import com.mine.university.game.model.Player;
import com.mine.university.game.model.Strategy;
import org.neuroph.core.NeuralNetwork;

import java.util.UUID;

public class CheckersPlayer implements Player {

    private UUID id;

    private Strategy<NeuralNetwork> strategy;

    public CheckersPlayer(Strategy<NeuralNetwork> strategy) {
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
