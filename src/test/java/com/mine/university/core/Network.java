package com.mine.university.core;

import org.junit.jupiter.api.Test;
import org.neuroph.core.Layer;
import org.neuroph.core.NeuralNetwork;

public class Network {

    @Test
    public void test() {
        NeuralNetwork neuralNetwork = new NeuralNetwork();
        Layer layer = new Layer();
        neuralNetwork.calculate();
        neuralNetwork.getOutput();
        neuralNetwork.addLayer(layer);
    }
}