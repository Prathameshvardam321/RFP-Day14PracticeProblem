package com.bridgelabz.stackqueue;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<E> {
    LinkedList<E> linkedList = new LinkedList<>();
    void push(E data){
        linkedList.add(data);
    }

    void peak(){
            System.out.println(linkedList.head.getData());
        }
        void display(){
        linkedList.display();
    }
    void popStack(){
        linkedList.pop();
    }
}
