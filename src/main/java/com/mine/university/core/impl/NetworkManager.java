package com.mine.university.core.impl;

import org.neuroph.core.Layer;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.Neuron;

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

    public static NeuralNetwork build(int[] neuronsPerLayer) {
        NeuralNetwork neuralNetwork = new NeuralNetwork();
        List<Layer> layers = new ArrayList<>();
        for (int i = 0; i < neuronsPerLayer.length; i++) {
            Layer layer = new Layer();
            for (int j = 0; j < neuronsPerLayer[i]; j++) {
                Neuron neuron = new Neuron();
                layer.addNeuron(neuron);
                if (i > 0) {
                    addInputConnections(layers.get(i - 1), neuron);
                }
            }
            layers.add(layer);
            neuralNetwork.addLayer(layer);
        }

        return neuralNetwork;
    }

    private static void connectLayers(Layer layer, Layer anotherLayer) {
        for (Neuron neuron : anotherLayer.getNeurons()) {
            Neuron n = new Neuron();
        }
    }

    private static void addInputConnections(Layer layer, Neuron neuron) {
        for (Neuron previousLayerNeuron : layer.getNeurons()) {
            //TODO rework to be able to read input from file
            neuron.addInputConnection(previousLayerNeuron, new Random().nextDouble());
        }
    }
}
