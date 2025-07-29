/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return lists;
        get(root,lists,list);
        return lists;
    }

    public static void get(Node root,ArrayList<ArrayList<Integer>> lists,ArrayList<Integer> list){
        list.add(root.data);
        if(root.left==null && root.right==null){
            lists.add(new ArrayList<>(list));
        }else{
            if(root.left!=null) get(root.left,lists,list); 
            if(root.right!=null) get(root.right,lists,list); 
        }
        list.remove(list.size()-1);
    }
}