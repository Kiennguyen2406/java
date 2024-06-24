public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(2, 10);
        ll.add(0, 9);

        ll.printList();
    }
}