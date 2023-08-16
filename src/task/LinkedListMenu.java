package task;

public class LinkedListMenu {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert_at_head(1);
        list.insert_at_head(2);
        list.insert_at_tail(3);
        list.delete_at_head();
        list.delete(2);

        System.out.println(list.is_empty());
        System.out.println(list.getHead().data);
        System.out.println(list.search(3).data);

    }
}
