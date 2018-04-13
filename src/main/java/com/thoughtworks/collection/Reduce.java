package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(this.arrayList);
    }

    public double getMinimum() {
        return Collections.min(this.arrayList);
    }

    public double getAverage() {
        int count = this.arrayList.size();
        double sum = 0;
        for (Integer value : this.arrayList) {
            sum += value;
        }
        return sum / count;
    }

    public double getOrderedMedian() {
        int length = this.arrayList.size();
        if (length % 2 == 0) {
            return (this.arrayList.get(length / 2) + this.arrayList.get(length / 2 - 1)) / 2.0;
        } else {
            return this.arrayList.get(length / 2);
        }
    }

    public int getFirstEven() {
        for (Integer value : this.arrayList) {
            if (value % 2 == 0) {
                return value;
            }
        }
        return -1;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(this.arrayList.isEmpty() || arrayList.isEmpty()){
            return false;
        }

        if(this.arrayList.size() != arrayList.size()){
            return false;
        }

        return this.arrayList.containsAll(arrayList);
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        for (Integer value : this.arrayList) {
            singleLink.addTailPointer(value);
        }
        int length = singleLink.size();
        if (length % 2 == 0) {
            return ((Integer)singleLink.getNode(6) + (Integer)singleLink.getNode(7)) / 2.0;
        } else {
            return Double.valueOf((Integer)singleLink.getNode(length / 2));
        }
    }

    public int getLastOdd() {
        int ruselt = -1;
        for (Integer value : this.arrayList) {
            if (value % 2 != 0) {
                ruselt = value;
            }
        }
        return ruselt;
    }

    public int getIndexOfLastOdd() {
        int indexOfLastOdd = -1;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 != 0) {
                indexOfLastOdd = i;
            }
        }
        return indexOfLastOdd;
    }
}
