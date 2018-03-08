package com.mine.university.core;

import com.mine.university.core.impl.NetworkManager;
import com.mine.university.core.impl.NeuralNode;
import org.junit.Test;

import java.util.List;

public class TestNetworkCreation {

    @Test
    public void testNetworkCreation() {
        List<NeuralNode> network = NetworkManager.build(32, 1, 91, 40, 10);
        System.out.println(network);
    }

}