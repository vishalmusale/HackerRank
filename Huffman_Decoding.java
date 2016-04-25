/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
{
    Node curNode = root;
    String ans = "";
    for(int i =0; i<S.length(); i++){
        if(S.charAt(i) == '1')
            curNode = curNode.right;
        else if(S.charAt(i) == '0')
            curNode = curNode.left;
        if(curNode.left == null && curNode.right == null){
            ans = ans + curNode.data;
            curNode = root;
        }
    }
    System.out.println(ans);
}