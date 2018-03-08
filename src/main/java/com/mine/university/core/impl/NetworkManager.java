package com.mine.university.core.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NetworkManager {

    public static List<NeuralNode> build(int input, int output, int... hidden) {
        validateParameters(input, output, hidden);
        List<NeuralNode> inputLayer = new ArrayList<>(input);
        List<NeuralNode> outputLayer = new ArrayList<>(output);
        List<List<NeuralNode>> hiddenLayers = new ArrayList<>();
        for (int hiddenLayerCount : hidden) {
            hiddenLayers.add(new ArrayList<>(hiddenLayerCount));
        }
        for (List<NeuralNode> hiddenLayer : hiddenLayers) {

        }
        return inputLayer;
    }

    public String toString(List<NeuralNode> nodes) {

        return "";
    }

    private static void fillLayer(final List<NeuralNode> nodes, final List<NeuralNode> incomingLayer, int capacity) {
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {

        }
    }

    private static void validateParameters(int input, int output, int... hidden) {
        if (input <= 0) {
            throw new IllegalArgumentException("Number of input layer is invalid.");
        }
        if (output <= 0) {
            throw new IllegalArgumentException("Number of output layers is invalid.");
        }
        if (hidden.length == 0) {
            throw new IllegalArgumentException("No hidden layers specified.");
        }
        for (int i = 0; i < hidden.length; i++) {
            if (hidden[i] <= 0) {
                throw new IllegalArgumentException(String.format("Hidden layer %s has 0 number of nodes", i));
            }
        }
    }
}
