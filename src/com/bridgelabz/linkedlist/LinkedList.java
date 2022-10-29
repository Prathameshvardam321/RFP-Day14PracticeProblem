package com.bridgelabz.linkedlist;

public class LinkedList <E>{

    Node<E> head ;
    Node<E> tail ;
    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void display() {
        Node<E> temp = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        while(temp != null){
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }
    public void append(E data) {
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public E pop() {
        E temp = head.getData();
        head = head.getNext();
        return temp;
    }
    public E popLast() {
        E temp = tail.getData();
        Node<E> secondLast = head;
        while(secondLast.getNext() != tail){
            secondLast = secondLast.getNext();
        }
        secondLast.setNext(null);
        tail = secondLast;
        return temp;
    }
    public Node search(E key){
        Node<E> temp = head;
        if (head==null){
            return null;
        }
        while (temp!=null){
            if (temp.getData().equals(key)){
                return temp;
            }
            temp=temp.getNext();
        }
        return null;
    }
    public Boolean insertion(E searchData,E insertData){
        Node<E> searchNode = search(searchData);
        if (searchNode!=null){
            Node<E> temp = searchNode.getNext();
            Node<E> newNode = new Node<>(insertData);
            newNode.setNext(temp);
            searchNode.setNext(newNode);
            display();
            return true;
        }
        return false;
    }
}
