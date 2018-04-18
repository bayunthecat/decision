package com.mine.university.core;

import com.mine.university.core.impl.NetworkManager;
import org.junit.jupiter.api.Test;
import org.neuroph.core.NeuralNetwork;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestNetworkCreation {

    private static final int EXPECTED_LAYERS_COUNT = 5;

    @Test
    public void testNetworkCreation() {
        NeuralNetwork neuralNetwork = NetworkManager.build(new int[] {32, 91, 40, 10, 1});
        assertNotNull(neuralNetwork);
        assertEquals(EXPECTED_LAYERS_COUNT, neuralNetwork.getLayersCount());
    }

}