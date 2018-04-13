package com.thoughtworks.collection;

public class LinkNode {
    private Integer data;
    private LinkNode next;

    public LinkNode(Integer data) {
        this.data = data;
        next = null;
    }

    public Integer getData() {
        return data;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
