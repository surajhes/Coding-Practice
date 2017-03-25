import java.util.Scanner;

/**
 * Created by suraj on 1/27/2017.
 */
public class BinaryTreePath {
    static class Node {
        int value;
        Node left, right;

        Node(Node left, Node right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        Node insert(Node newNode, Node head) {
            if (head == null) {
                head = newNode;
                return head;
            } else {
                if (head.value <= newNode.value) {
                    insert(newNode, head.left);
                } else {
                    insert(newNode, head.right);
                }
            }
            return head;
        }
    }

    public static void main1(String[] args) {
        Node node15 = new Node(15);
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node22 = new Node(22);
        Node node2 = new Node(2);
        Node node16 = new Node(16);
        Node node0 = new Node(0);
        Node node5 = new Node(5);
        Node node3 = new Node(3);

        node15.left = node10;
        node15.right = node20;
        node20.left = node22;
        node10.left = node6;
        node10.right = node7;
        node7.left = node2;
        node7.right = node16;
        node2.left = node0;
        node2.right = node5;
        node16.left = node3;
        System.out.println(minSum(node15));
    }

    static int minSum(Node head){
        if(head == null){
            return 0;
        }

        int sum = head.value;

        int leftSum = minSum(head.left);
        int rightSum = minSum(head.right);

        if(leftSum < rightSum){
            return sum + leftSum;
        }else{
            return sum + rightSum;
        }
    }
}
