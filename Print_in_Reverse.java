/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    if(head != null)
        actualPrint(head);
}

void actualPrint(Node curNode) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    if(curNode.next != null){
        actualPrint(curNode.next);
    }
    
    System.out.println(curNode.data);
}