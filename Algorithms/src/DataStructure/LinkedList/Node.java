package DataStructure.LinkedList;

public class Node {
    int data;
    Node next;

    void Print(Node head) {
        if (head == null) {
            return;
        } else {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }

    Node Insert(Node head, int data) {
        if (head == null) {
            head = new Node();
            head.data = data;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node();
            node.next.data = data;
        }
        return head;
    }
    Node InsertHead(Node head,int x) {
        if(head == null){
            head = new Node();
            head.data = x;
            return head;
        }else{
            Node current = new Node();
            current.data = x;
            current.next = head;
            return current;
        }


    }
    Node InsertNth(Node head, int data, int position) {
        if (position == 0) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            return node;
        }
        head.next = InsertNth(head.next, data, position - 1);
        return head;
    }

}
