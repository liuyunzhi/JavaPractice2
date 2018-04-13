package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> ruselt = new ArrayList<>();
        int interval = this.random.nextInt(3);
        for (int i = number - interval; i >= 0; i -= interval) {
            ruselt.add(new Integer(i));
        }
        return ruselt;
    }
}
