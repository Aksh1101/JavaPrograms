package linkedlist;

public class mainDLL {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFirst(99);
        dll.insertFirst(98);
        dll.insertFirst(97);
        dll.insertFirst(96);
        dll.display();
        dll.insertLast(100);
        dll.insertAfter(98,78);
        dll.display();


    }
}
