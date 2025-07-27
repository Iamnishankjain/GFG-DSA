/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node) {
        int arr[]=new int[1];
        arr[0]=Integer.MIN_VALUE;
        getSum(node,arr);
        return arr[0];
    }

    int getSum(Node root,int arr[]){
        if(root==null) return 0;
        int ls=Math.max(0,getSum(root.left,arr));
        int rs=Math.max(0,getSum(root.right,arr));
        arr[0]=Math.max(arr[0],ls+rs+root.data);
        return root.data+Math.max(ls,rs);
    }
}