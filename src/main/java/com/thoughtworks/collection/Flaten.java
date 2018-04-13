package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> ruselt = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                ruselt.add(array[i][j]);
            }
        }
        return ruselt;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> ruselt = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!ruselt.contains(array[i][j])) {
                    ruselt.add(array[i][j]);
                }
            }
        }
        return ruselt;
    }
}
