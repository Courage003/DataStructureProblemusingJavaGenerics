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

    // Method to remove the first element (pop)
    public T pop() {
        if (head == null) {
            System.out.println("List is empty. Nothing to pop.");
            return null;
        }
        T removedData = head.data; // Save the data of the head
        head = head.next;          // Move head to the next node
        return removedData;        // Return the removed data
    }

    // Method to remove the last element (popLast)
    public T popLast() {
        if (head == null) { // List is empty
            System.out.println("List is empty. Nothing to pop.");
            return null;
        }
        if (head.next == null) { // List has only one node
            T removedData = head.data;
            head = null;
            return removedData;
        }
        Node<T> temp = head;
        while (temp.next.next != null) { // Traverse to the second last node
            temp = temp.next;
        }
        T removedData = temp.next.data; // Save data of the last node
        temp.next = null;               // Remove the last node
        return removedData;             // Return the removed data
    }

    //Method to search for a node with a given value
    public Node<T> search(T key){
        Node<T> temp=head;
        while(temp!=null){
            if(temp.data.equals(key)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
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

        // Add elements 56, 30, and 70
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        // Display the original linked list
        System.out.println("Original List:");
        linkedList.display();

        // Remove the last element (popLast)
        System.out.println("Popped last element: " + linkedList.popLast());

        // Display the updated linked list
        System.out.println("Updated List:");
        linkedList.display();
    }
}