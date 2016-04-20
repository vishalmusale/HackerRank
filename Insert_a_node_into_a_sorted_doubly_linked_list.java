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

Node SortedInsert(Node head,int data) {
    Node cur = head;
    Node newNode = new Node();
    newNode.data = data;
    
    if(head == null)            //  Empty List
        head.data = data;
    else if(cur.next == null){  //  List size == 1
        if(cur.data < data){
            cur.next = newNode;
            newNode.prev = cur;
        }
        else{                   
            newNode.next = cur;
            cur.prev = newNode;
            head = newNode;      
        }
    }
    else{                       //  list size > 1
        while(cur.next!=null){
            if(cur.next.data > data){
                newNode.next = cur.next;
                newNode.prev = cur;
                cur.next = newNode;
                return head;
            }
            else
                cur = cur.next;
        }    
        cur.next = newNode;
        newNode.prev = cur;
    }
            
    return head;
}