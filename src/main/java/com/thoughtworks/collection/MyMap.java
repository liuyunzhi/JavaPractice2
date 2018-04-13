package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> ruselt = new ArrayList<>();
        for (Integer value : this.array) {
            ruselt.add(value * 3);
        }
        return ruselt;
    }

    public List<String> mapLetter() {
        List<String> ruselt = new ArrayList<>();
        for (Integer value : this.array) {
            ruselt.add(letterList.get(value - 1));
        }
        return ruselt;
    }

    public List<String> mapLetters() {
        int letterCount = letterList.size();
        List<String> ruselt = new ArrayList<>();
        for (Integer value : this.array) {
            if (value <= letterCount) {
                ruselt.add(letterList.get(value - 1));
            } else {
                int cycleTimes = value / letterCount;
                int remainder = value % letterCount;
                if (remainder == 0) {
                    ruselt.add(letterList.get(cycleTimes - 2) + letterList.get(letterCount - 1));
                } else {
                    ruselt.add(letterList.get(cycleTimes - 1) + letterList.get(remainder - 1));
                }
            }
        }
        return ruselt;
    }

    public List<Integer> sortFromBig() {
        this.array.sort((o1, o2)->(o2 - o1));
        return this.array;
    }

    public List<Integer> sortFromSmall() {
        this.array.sort((o1, o2)->(o1 - o2));
        return this.array;
    }
}
