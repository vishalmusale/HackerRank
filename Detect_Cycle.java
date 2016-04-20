/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
    if(head == null)
        return 0;
    else{
        Node curNode = head;
        Node nextNode = head;
        
        while(curNode != null && curNode.next != null){
            curNode = curNode.next;
            nextNode = nextNode.next.next;
            
            if(curNode == null || nextNode == null)
                return 0;
            if(curNode == nextNode)
                return 1;
        }
    }
    return 0;
}