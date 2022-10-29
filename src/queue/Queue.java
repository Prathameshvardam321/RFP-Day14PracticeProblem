package queue;

import com.bridgelabz.linkedlist.LinkedList;

public class Queue <T>{
    LinkedList<T> linkedList= new LinkedList<>();
    void enqueue(T data){
        linkedList.append(data);
    }
    void printQueue(){
        linkedList.display();
    }
}
