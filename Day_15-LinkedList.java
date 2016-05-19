	public static  Node insert(Node head,int data)
	{
  	//Complete this method
        Node temp = new Node(data);
            
        if(head == null)
            head = temp;
        else{
            Node curNode = head;
            while(curNode.next != null){
                curNode = curNode.next;
            }
            curNode.next = temp;
        }
        return head;       
	}