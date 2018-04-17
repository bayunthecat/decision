package com.mine.university.core;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class TestStasDown {

    private static final int ELEMENT_COUNT = 100;

    @Test
    public void test() {
        int [] array = new int[ELEMENT_COUNT];
        fillAndSort(array);
        System.out.println(Arrays.toString(array));
    }

    private int findBinary (int[] array, int target) {
        int steps = 0, from, to, element = array[0], index = array.length / 2;
        while (target != element) {
            //
            element = array[index];
            if (element > target) {
                
            }
        }
        return steps;
    }

    private void fillAndSort(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        Arrays.sort(array);
    }
}
