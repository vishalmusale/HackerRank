/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    
    int count;
    Node curNode = head;
    Node temp = new Node();     //  Creating temp node
    temp.data = data;            //  Adding data to the new node
    
    if(position == 0){
        temp.next = head;
        head = temp;
    }
    else{
        //  Traverse through the list until hit the desired position
        while(--position>0){
            curNode = curNode.next;
        }

        temp.next = curNode.next;    //  curNode --> = temp -->
        curNode.next = temp;         //  curNode --> temp
    }
     
    return head;
}