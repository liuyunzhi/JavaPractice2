package com.thoughtworks.collection;

public class MySingleLink implements SingleLink{
    private LinkNode head;

    public MySingleLink(){
        this.head = new LinkNode(0);
    }

    @Override
    public Object getHeaderData() {
        return head.getData();
    }

    @Override
    public Object getTailData() {
        LinkNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData();
    }

    @Override
    public int size() {
        int length = 0;
        LinkNode current = head;
        while (current.getNext() == null) {
            length++;
            current = current.getNext();
        }
        return length;
    }

    @Override
    public boolean isEmpty() {
        if (head.getNext() == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteFirst() {
        if (head.getNext() == null) {
            return false;
        } else {
            head = head.getNext();
            return true;
        }
    }

    @Override
    public boolean deleteLast() {
        if (head.getNext() == null) {
            return false;
        }
        LinkNode current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        return true;
    }

    @Override
    public void addHeadPointer(Object item) {
        LinkNode node = new LinkNode((Integer) item);
        node.setNext(head.getNext());
        head.setNext(node);
    }

    @Override
    public void addTailPointer(Object item) {
        LinkNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        LinkNode node = new LinkNode((Integer)item);
        current.setNext(node);
    }

    @Override
    public Object getNode(int index) {
        LinkNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
}
