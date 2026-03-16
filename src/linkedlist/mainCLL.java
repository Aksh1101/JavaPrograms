package linkedlist;

public class mainCLL {
    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insert(45);
        cll.insert(98);
        cll.insert(65);
        cll.insert(56);
        cll.display();
        cll.delete(98);
        cll.display();
    }
}
