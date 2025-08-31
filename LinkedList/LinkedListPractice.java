class LinkedListPractice {

    Node head;
    // ------------------- Node class ------------------------
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ---------------------- add first postion ------------------------------
    public void addFirst(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }

        nn.next = head;
        head = nn;
    }

    // ---------------------- add last postion ------------------------------
    public void addLast(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = nn;
    }

    // ---------------------- print all elements ------------------------------
    public void print() {
        if (head == null) {
            System.out.println("EMPTY");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListPractice ll = new LinkedListPractice();
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addLast(12);
        ll.addLast(14);
        ll.print();
    }
}