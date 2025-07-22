/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int diameter(Node root) {
        // Your code here
        int arr[]=new int[1];
        maxD(root,arr);
        return arr[0];
    }
    public int maxD(Node root,int arr[]){
        if(root==null){
            return 0;
        }

        int lh=maxD(root.left,arr);
        int rh=maxD(root.right,arr);

        arr[0]=Math.max(arr[0],rh+lh);
        return 1+Math.max(lh,rh);
    }
}