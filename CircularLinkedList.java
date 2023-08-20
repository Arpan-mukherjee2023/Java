import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
public class CircularLinkedList {
    Node head,tail;
    CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }
    void insert(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    void display(){
        Node temp = head;
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while(temp != head);
        System.out.println("null");
    }
    public static void main(String[] args) {
        CircularLinkedList first_list = new CircularLinkedList();
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of data : ");
        n = obj.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Data : ");
            int data = obj.nextInt();
            first_list.insert(data);
        }
        first_list.display();
        obj.close();
    }
}
