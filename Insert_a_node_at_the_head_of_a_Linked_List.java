/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
    
    Node tempHead = new Node();     //  Creating temp node
    
    tempHead.data = x;    //  Adding data to the new head
    tempHead.next = head;    //  new_Head --> old_Head
    head = tempHead;        //  Changing head to 1st position
    
    
    return head;
}
