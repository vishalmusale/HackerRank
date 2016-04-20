/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 

    Node curNode = head;
    while(head.next != null){
        if(head.data == head.next.data)
            head.next = head.next.next;
        else
            head = head.next;
    }
    return curNode;
}