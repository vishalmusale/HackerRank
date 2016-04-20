/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    int count=0;
    Node curNode=head;
    
    while(curNode.next != null){
        curNode = curNode.next;
        count++;
    }
    
    while(count>=0){
        if(count==n)
            return head.data;
        else{
            count--;
            head = head.next;
        }
    }
    return head.data;
}