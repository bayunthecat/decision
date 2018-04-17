package com.mine.university.core;

import com.mine.university.core.impl.NetworkManager;
import org.junit.jupiter.api.Test;
import org.neuroph.core.NeuralNetwork;

public class TestNetworkCreation {

    @Test
    public void testNetworkCreation() {
        NeuralNetwork neuralNetwork = NetworkManager.build(new int[] {32, 91, 40, 10, 1});
        System.out.println(neuralNetwork);
    }

}