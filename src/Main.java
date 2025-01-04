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
        if(head==null){
            head=newNode;
        }
        else{
            Node<T> temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
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

        //Create a Linked List instance
        LinkedList<Integer>linkedList= new LinkedList<>();

        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        //Display linked list
        linkedList.display();
    }
}