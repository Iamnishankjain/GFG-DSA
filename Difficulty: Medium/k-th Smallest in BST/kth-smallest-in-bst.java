// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        int arr[]=new int[1];
        int data=get(root,k,arr);
        return data;
    }
    public int get(Node root,int k,int[] c){
        if(root==null) return -1;
        int l=get(root.left,k,c);
        
        c[0]++;
        if(c[0]==k) return root.data;
        int r=get(root.right,k,c);
        
        return l==-1 ? r : l;
    }
}