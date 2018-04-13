package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> ruselt = new ArrayList<>();
        if (left <= right){
            for (int i = left; i <= right; i++) {
                ruselt.add(i);
            }
        } else {
            for (int i = left; i >= right; i--) {
                ruselt.add(i);
            }
        }
        return ruselt;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> ruselt = new ArrayList<>();
        if (left <= right){
            for (int i = left % 2 == 0 ? left : left + 1; i <= right; i += 2) {
                ruselt.add(i);
            }
        } else {
            for (int i = left % 2 == 0 ? left : left - 1; i >= right; i -= 2) {
                ruselt.add(i);
            }
        }
        return ruselt;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> evenArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray.add(array[i]);
            }
        }
        return evenArray;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            firstList.add(new Integer(firstArray[i]));
        }
        for (int i = 0; i < secondArray.length; i++) {
            secondList.add(new Integer(secondArray[i]));
        }
        firstList.retainAll(secondList);
        return firstList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            firstList.add(firstArray[i]);
        }
        for (int i = 0; i < secondArray.length; i++) {
            secondList.add(secondArray[i]);
        }
        secondList.removeAll(firstList);
        firstList.addAll(secondList);
        return firstList;
    }
}
