package com.mine.university.core;

import com.mine.university.core.impl.NeuralNode;

import java.util.List;

public interface Node<T> {

    List<NeuralNode> getIncomingNodes();

    T getValue();
}