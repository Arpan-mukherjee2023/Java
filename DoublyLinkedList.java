import java.util.Scanner;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int d){
        this.data = d;
        this.next = this.prev = null;
    }
}
class DoublyLinkedList{
    public static Node head,tail;
    Node append(int data){
        /* appends data at end of list*/
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            tail = head;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            new_node.prev = temp;
            temp.next = new_node;
            tail = new_node;
        }
        return head;
    }
    Node insert(int d, int pos){
        /*inserts a given data at a given position */
        Node temp = head;
        for(int i = 0; i < pos; i++){
            temp = temp.next;
        }
        Node newNode = new Node(d);
        newNode.next = temp.next;
        temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
        return head;
    }
    void show(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int data;
        for(int i = 0; i < 5; i++){
            System.out.println("Enter data : ");
            data = obj.nextInt();
            list.append(data);
        }
        list.show();
        list.insert(23, 2);
        list.show();
        obj.close();
    }
}
