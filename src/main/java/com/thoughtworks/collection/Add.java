package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int sum = 0;
        int start = leftBorder % 2 == 0 ? leftBorder % 2 : leftBorder % 2 + 1;
        for (int i = start; i <= rightBorder ; i += 2) {
            sum += i;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int sum = 0;
        int start = leftBorder % 2 == 0 ? leftBorder % 2 + 1 : leftBorder % 2 ;
        for (int i = start; i <= rightBorder ; i += 2) {
            sum += i;
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (Integer value : arrayList) {
            sum += (value * 3 + 2);
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Integer value = arrayList.get(i);
            if (value % 2 != 0) {
                arrayList.set(i, value * 3 + 2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (Integer value : arrayList) {
            if (value % 2 != 0) {
                sum += (value * 3 + 5);
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenArray = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                evenArray.add(arrayList.get(i));
            }
        }
        int length = evenArray.size();
        if (length % 2 == 0) {
            return (evenArray.get(length / 2) + evenArray.get(length / 2 - 1)) / 2;
        } else {
            return evenArray.get(length / 2);
        }
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int sum = 0;
        int count = 0;
        for (Integer value : arrayList) {
            if (value % 2 == 0) {
                sum += value;
                count++;
            }
        }
        return sum / count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> evenArray = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                evenArray.add(arrayList.get(i));
            }
        }
        return evenArray.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> evenArray = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0 && !evenArray.contains(arrayList.get(i))) {
                evenArray.add(arrayList.get(i));
            }
        }
        return evenArray;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        int length = arrayList.size();
        int left = 0;
        int right = length - 1;
        Integer[] ruselt = new Integer[length];
        int i = 0;
        int j = 0;
        while (left < right) {
            while (i < length && arrayList.get(i) % 2 != 0) {
                i++;
            }
            if (i < length) {
                ruselt[left++] = arrayList.get(i++);
            }
            while (j < length && arrayList.get(j) % 2 == 0) {
                j++;
            }
            if (j < length) {
                ruselt[right--] = arrayList.get(j++);
            }
        }
        return Arrays.asList(ruselt);
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> ruselt = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            int value = arrayList.get(i);
            int next = arrayList.get(i + 1);
            ruselt.add(i, (value + next) * 3);
        }
        return ruselt;
    }
}
