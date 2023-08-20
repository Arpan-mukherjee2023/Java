class LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    static class List{
        public static Node head;
        Node insertBeg(int d){
            Node newNode = new Node(d);
            if(head == null){
                head = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
            return head;
        }
        void show_list(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        Node insertEnd(int d){
            Node newNode = new Node(d);
            if(head == null){
                head = newNode;
            }
            else{
                Node temp = head;
                while(temp.next != null)
                    temp = temp.next;
                temp.next = newNode;
            }
            return head;
        }
        Node delete_from_end(){
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }
        Node delete_from_head(){
            //just changing the head pointer to next one
            head = head.next;
            return head;
        }
        void getMax(){
            int max = head.data;
            Node temp = head.next;
            while(temp != null){
                if(max < temp.data)
                    max = temp.data;
                temp = temp.next;
            }
            System.out.println("The maximum element is : " + max);
        }
    }
    public static void main(String[] args) {
        List x = new List();
        int num[] = {1,2,3,4,5};
        for(int d : num){
            x.insertBeg(d);
        }
        x.show_list();
        x.delete_from_head();
        x.show_list();
        x.getMax();
    }
}