/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 

    headA = headA.next;
    
    while(headA.next != null){
        Node curB = headB.next;
        while(curB != null){
            if(headA.data == curB.data)
                return headA.data;
            else
                curB = curB.next;
        }
        headA = headA.next;
    }
    return headA.data;
}