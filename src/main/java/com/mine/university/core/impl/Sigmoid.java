package com.mine.university.core.impl;

import java.util.function.Function;

public class Sigmoid implements Function<Double, Double> {

    @Override
    public Double apply(Double aDouble) {
        return 1 / (1 + Math.pow(Math.E, -aDouble));
    }

}