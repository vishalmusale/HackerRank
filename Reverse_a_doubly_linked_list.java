/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {

    Node newHead = new Node();
    Node prevPointer = head.prev;
            
    if(head == null || head.next == null){
        head.prev = head.next;
        head.next = prevPointer;
        return head;        
    }
    else{
        head.prev = head.next;
        newHead = Reverse(head.next);
        
        head.next = prevPointer;
    }        
    return newHead;
}