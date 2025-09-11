import java.util.LinkedList;
import java.util.Arrays;

class Node {
   Node next;
   int data;

   Node(int data) {
      this.data = data;
      this.next = null;
   }
}

public class RemoveElementFromLinkedList {

   private Node removeEle(Node head, int val) {
      if (head == null)
         return null;
      head.next = removeEle(head.next, val);
      return head.data == val ? head.next : head;
   }

   public static void main(String[] args) {
      LinkedList<Integer> ll = new LinkedList<>();
      ll.addAll(Arrays.asList(1, 2, 3, 6, 5, 7, 6));

      Node head = null, tail = null;
      for (int val : ll) {
         Node newNode = new Node(val);
         if (head == null) {
            head = newNode;
            tail = newNode;
         } else {
            tail.next = newNode;
            tail = newNode;
         }
      }
      RemoveElementFromLinkedList obj = new RemoveElementFromLinkedList();
      head = obj.removeEle(head, 6);

      Node curr = head;
      while (curr != null) {
         System.out.print(curr.data + " ");
         curr = curr.next;
      }
      System.out.println();
   }
}
