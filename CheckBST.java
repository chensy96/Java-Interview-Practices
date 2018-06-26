package review;

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
boolean checkBST(Node root) {
    //set  min and max and update them
    //pro-order traversal
    //BFS
   return checkBST(root, null, null);
}

boolean checkBST(Node n, Integer min, Integer max){
    if(n==null){
        return true;
    }
    
    if( (max!=null &&  n.data >= max) || (min!=null && n.data <= min) ){
        return false;
    }
    
    if(!checkBST(n.left,min,n.data) || !checkBST(n.right, n.data,max)){
        return false;
    }

    return true;
}