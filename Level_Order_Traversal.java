   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
       int depth = findDepth(root);
       int counter = 0;
       while(counter <= depth){
           levelPrinter(root, counter);
           // System.out.println("");   //  To print each level on different line
           counter++;
       }      
    }

    int findDepth(Node root){
        if(root == null)
            return -1;
        else 
            return Math.max(findDepth(root.left), findDepth(root.right)) + 1;
    }

    void levelPrinter(Node root, int depth){
        if(root==null) 
            return;
 		if(depth == 0) 
            System.out.print(root.data + " ");
 		else{
 			levelPrinter(root.left, depth-1);
 			levelPrinter(root.right, depth-1);
 		} 
    }