package com.bridgelabz.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();
        System.out.println();
        linkedList2.insertion(30,123);

    }
}
