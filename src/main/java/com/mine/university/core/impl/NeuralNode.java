package com.mine.university.core.impl;

import com.mine.university.core.Node;

import java.util.Collections;
import java.util.List;

public class NeuralNode implements Node<Double> {

    private double value;

    private final List<NeuralNode> incomingNodes;

    private final List<NeuralNode> outgoingNodes;

    public NeuralNode(double value) {
        this.value = value;
        incomingNodes = Collections.emptyList();
        this.outgoingNodes = Collections.emptyList();
    }

    public NeuralNode(double value, List<NeuralNode> incomingNodes, List<NeuralNode> outgoingNodes) {
        this.value = value;
        this.incomingNodes = incomingNodes;
        this.outgoingNodes = outgoingNodes;
    }

    @Override
    public List<NeuralNode> getIncomingNodes() {
        return incomingNodes;
    }

    @Override
    public Double getValue() {
        return value;
    }
}