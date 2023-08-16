package task;

public class LinkedList {

    private Node head;

    public LinkedList(){
        this.head = null;
    }
    public Node getHead(){
        return this.head;
    }
    public void insert_at_tail(int data){
        Node node = new Node(data);

        if (this.head == null){
            this.head = node;
        }else {
            Node current = this.head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insert_at_head(int data) {
        Node node = new Node(data);

        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void delete(int data) {
        if (this.head == null) {
            return;
        }

        if (this.head.data == data) {
            this.head = this.head.next;
            return;
        }

        Node current = this.head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void delete_at_head() {
        if (this.head == null) {
            return;
        }

        this.head = this.head.next;
    }

    public Node search(int data) {
        Node current = this.head;

        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public boolean is_empty() {
        return this.head == null;
    }
}

