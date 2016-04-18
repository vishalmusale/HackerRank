/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    
    Node curNode = head;
    Node temp = new Node();
    // Traverse until last node
    while(curNode.next != null){
        curNode = curNode.next;
    }
    
    curNode.next = temp;    //  Adding new node at the end
    temp.data = data;       //  Adding data to the new node
    
    return head;
}
