package com.mine.university.game.model.impl;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Point;
import com.mine.university.game.model.Strategy;
import org.neuroph.core.NeuralNetwork;

import java.util.List;

public class NeuralNetworkBasedStrategy implements Strategy {

    private NeuralNetwork neuralNetwork = new NeuralNetwork();

    public NeuralNetworkBasedStrategy(NeuralNetwork neuralNetwork) {
        this.neuralNetwork = neuralNetwork;
    }

    @Override
    public double evaluateBoard(Board<Point> board) {
        return 0;
    }

    @Override
    public double[] evaluateBoards(List<Board<Point>> boardList) {
        return new double[0];
    }


}