    public static Node removeDuplicates(Node head) {
      //Write your code here
        Node curNode = head;
        while(head.next != null){
            if(head.data == head.next.data)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return curNode;
    }