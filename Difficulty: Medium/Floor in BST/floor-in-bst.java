// User function Template for Java

class Solution {
    public static int floor(Node root, int key) {
        // Code here
        int floor=-1;
        
        while(root!=null){
            if(root.data==key) return key;
            else if(root.data>key) root=root.left;
            else{
                floor=root.data;
                root=root.right;
            }
        }
        return floor;
    }
}