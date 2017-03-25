/**
 * Created by suraj on 1/27/2017.
 */
public class LinkedListReversal {
    public static void linkedListReverse(Node first) {

        if(first == null || first.next == null || first.next.next == null){
            return;
        }
        Node slow = first,fast = first.next;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null,next = slow.next,curr = slow.next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        slow.next = prev;
        while(first != null){
            System.out.print(first.value + "->");
            first = first.next;
        }


/*
        if(first == null || first.next == null || first.next.next == null){
            return;
        }
        RootNode slow = first,fast = first.next;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        RootNode temp = null,prev = null,current = slow.next;
        while (current != null){
            prev = current;
            current = current.next;
            prev.next = temp;
            temp = prev;
        }
        slow.next = prev;
        while(first != null){
            System.out.print(first.value + "->");
            first = first.next;
        }
*/
    }
}
