/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        int arr[]=new int[1];
        count(root,arr);
        return kthSmallest(root,arr[0]-k+1);
    }
    public void count(Node root, int c[]){
        if(root==null){
            return;
        }
        count(root.left,c);
        c[0]++;
        count(root.right,c);
    }
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