class Node {
    int data;
    Node next;
    Node bottom;
    
    Node(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

class LinkedList {
    Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data < b.data) {
            a.bottom = merge(a.bottom, b);
            return a;
        } else {
            b.bottom = merge(a, b.bottom);
            return b;
        }
    }
    
    Node flatten(Node head) {
        if (head == null || head.next == null) return head;
        head.next = flatten(head.next);
        head = merge(head, head.next);
        return head;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.bottom;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        Node head = new Node(5);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);
        
        Node second = new Node(10);
        second.bottom = new Node(19);
        second.bottom.bottom = new Node(22);
        
        Node third = new Node(28);
        third.bottom = new Node(35);
        third.bottom.bottom = new Node(40);
        
        Node fourth = new Node(50);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        
        Node flattenedHead = list.flatten(head);
        list.printList(flattenedHead);
    }
}
