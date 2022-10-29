package com.bridgelabz.stackqueue;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<E> {
    LinkedList<E> linkedList = new LinkedList<>();
    void push(E data){
        linkedList.add(data);
    }

    void display(){
        linkedList.display();
    }
}
