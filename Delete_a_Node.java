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

Node Delete(Node head, int position) {
  // Complete this method
    
    if(position == 0){
        head = head.next;
    }
    else{
        Node curNode = head;
        
        //  Traverse through the list until hit the desired position
        while(--position>0){
            curNode = curNode.next;
        }

        curNode.next = curNode.next.next;         //  curNode -X-> curNode.next --> curNode.next.next
    }                                             //           |-----------------|^ 
     
    return head;
}