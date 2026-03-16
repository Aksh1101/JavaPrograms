package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertLast(int value) {
        if(tail == null) {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertAt(int value , int index) {
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;

    }

    // insert using recursion
    // can use when size/ tail is not given
    public void insert(int value , int index ) {


    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }
    public int deleteLast() {
        if (size <=1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteAt(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node previous = get(index-1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        return  value;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
