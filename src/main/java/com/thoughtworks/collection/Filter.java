package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> ruselt = new ArrayList<>();
        for (Integer value : this.array) {
            if (value % 2 == 0) {
                ruselt.add(value);
            }
        }
        return ruselt;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> ruselt = new ArrayList<>();
        for (Integer value : this.array) {
            if (value % 3 == 0) {
                ruselt.add(value);
            }
        }
        return ruselt;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> ruselt = new ArrayList<>();
        for (Integer value : firstList) {
            if (secondList.contains(value)) {
                ruselt.add(value);
            }
        }
        return ruselt;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> ruselt = new ArrayList<>();
        for (Integer value : this.array) {
            if (!ruselt.contains(value)) {
                ruselt.add(value);
            }
        }
        return ruselt;
    }
}