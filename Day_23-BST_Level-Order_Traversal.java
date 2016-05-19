	static void levelOrder(Node root){
      //Write your code here
      
        // Get Height of the tree
        int ht = heightOfTree(root);
        
        if(ht<0)
            return;
        else{   //  Print Level
            for(int i=0; i<=ht; i++){
                printLevel(root, i);
            }
        }
    }
    
    static int heightOfTree(Node root){
        if(root==null)
            return -1;
        else{
            return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
        }
    }

    static void printLevel(Node root, int l){
        if(root == null)
            return;
        if(l==0)
            System.out.print(root.data + " ");
        else if(l>0){
            printLevel(root.left, l-1);
            printLevel(root.right, l-1);
        }
    }