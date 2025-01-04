//Node class to represent each element in the linked list
class Node<T>{
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

//LinkedList class to manage the List
class LinkedList<T>{
    private Node<T> head;

    //Method to add a new node to Linked List
    public void add(T data){
        Node<T> newNode= new Node<>(data);
        newNode.next=head; //Point new node to current head
        head=newNode;
    }

    //Method to append new node to end of Linked List
    public void append(T data){
        Node<T> newNode= new Node<>(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node<T>temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=newNode;
        }
    }

    public void insertAfter(T prevData, T data){
        Node<T>temp=head;
        while(temp!=null && !temp.data.equals(prevData)){
            temp=temp.next;
        }
        if(temp!=null){
            Node<T>newNode= new Node<>(data);
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }

    //Method to display Linked List
    public void display(){
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

//Main class to demonstrate Linked List


public class Main {
    public static void main(String[] args) {

        // Create a LinkedList instance
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements 56 and 70
        linkedList.append(56);
        linkedList.append(70);

        // Insert 30 between 56 and 70
        linkedList.insertAfter(56, 30);

        // Display the linked list
        linkedList.display();
    }
}