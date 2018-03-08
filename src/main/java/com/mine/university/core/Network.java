package com.mine.university.core;

import java.util.ArrayList;

/**
 * Interface that represent a way of interacting with neural network.
 * @param <T> type of a value
 */
public interface Network<T> {

    /**
     * Retrieves immutable list of input nodes for network.
     * @return ordered list of input nodes.
     */
    ArrayList<Node<T>> getInputNodes();

    /**
     * Retrieves immutable list of output nodes for network.
     * @return ordered list of output nodes.
     */
    ArrayList<Node<T>> getOutputNodes();

    /**
     * Adds specified hidden layer to network structure. All input nodes for {@link Node}, that are located after or
     * before inserted layer will be recalculated automatically. If specified layer does not exist, layer will be
     * inserted as the last.
     * @param nodes to be added as hidden layer.
     * @param layer value that represents ordinal for layer to be added.
     * @return immutable list of nodes which were just added as hidden layer.
     */
    ArrayList<Node<T>> addHiddenLayer(ArrayList<Node> nodes, int layer);

    /**
     * Adds specified hidden layer to network. Layer will be added as hidden layer after the last present hidden layer,
     * before the output, or the first if none were added.
     * @param nodes to be added as hidden layer
     * @return immutable list of nodes which were just added as hidden layer.
     */
    ArrayList<Node<T>> addHiddenLayer(ArrayList<Node> nodes);

    /**
     * Removes specified hidden layer from network. Input nodes will be automatically recalculated.
     * @param layer ordinal number of hidden layer to be removed.
     * @return immutable list of removed nodes.
     */
    ArrayList<Node<T>> removeHiddenLayer(int layer);

    /**
     * @return current hidden layer count
     */
    int getHiddenLayersSize();
}
