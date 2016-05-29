 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
{
    if(root == null){
        root = new Node();
        root.data = value;
    }
    else
        Insertion(root, value);
    return root;
}

static void Insertion(Node root,int value){
    if(root.data > value){
        if (root.left != null) 
            Insertion(root.left, value);
        else{
            root.left = new Node();
            root.left.data = value;
        }
    }
    else if (root.data < value) {
        if (root.right != null) 
            Insertion(root.right, value);
        else {
            root.right = new Node();
            root.right.data = value;
        }
    }
}