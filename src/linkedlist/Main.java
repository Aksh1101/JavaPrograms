package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(33);
        list.insertFirst(42);
        list.insertFirst(63);
        list.insertFirst(75);
        list.insertLast(22);
        list.insertAt(59,2);
        list.insertAt(80,4);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAt(2));
        list.display();


    }
}
