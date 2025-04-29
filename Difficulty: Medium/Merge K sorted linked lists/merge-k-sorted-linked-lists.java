//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    /* Function to print nodes in a given linked list */
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Driver program to test the above functions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());
            List<Node> lists = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                String[] values = line.split(" ");
                Node head = null, temp = null;

                for (String value : values) {
                    Node newNode = new Node(Integer.parseInt(value));
                    if (head == null) {
                        head = newNode;
                        temp = head;
                    } else {
                        temp.next = newNode;
                        temp = temp.next;
                    }
                }

                lists.add(head);
            }

            Solution sol = new Solution();
            Node head = sol.mergeKLists(lists);

            printList(head);
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java
/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        if(arr.size()==1){
            return arr.get(0);
        }
        Node head= merge(arr.get(0),arr.get(1));
        for(int i=2;i<arr.size();i++){
            head=merge(head,arr.get(i));
        }
        return head;
    }
    
    public static Node merge(Node leftHead,Node rightHead){
        Node dummy=new Node(0);
        Node ptr=dummy;
        while(leftHead!=null && rightHead!=null){
            if(leftHead.data<rightHead.data){
                ptr.next=leftHead;
                leftHead=leftHead.next;
            }
            else{
                ptr.next=rightHead;
                rightHead=rightHead.next;
            }
            ptr=ptr.next;
        }
        while(leftHead!=null){
            ptr.next=leftHead;
            leftHead=leftHead.next;
            ptr=ptr.next;
        }
        while(rightHead!=null){
            ptr.next=rightHead;
            rightHead=rightHead.next;
            ptr=ptr.next;
        }
        ptr.next=null;
        return dummy.next;
    }
}