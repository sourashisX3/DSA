public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null)
                System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        
        ListNode n1 = ll.new ListNode(1);
        ListNode n2 = ll.new ListNode(2);
        ListNode n3 = ll.new ListNode(3);
        ListNode n4 = ll.new ListNode(4);
        ListNode n5 = ll.new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.print("Original list: ");
        ll.printList(n1);

        ListNode rev = ll.reverseList(n1);

        System.out.print("Reversed list: ");
        ll.printList(rev);
    }
}
