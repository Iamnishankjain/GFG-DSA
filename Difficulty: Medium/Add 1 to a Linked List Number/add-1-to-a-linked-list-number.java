//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        if(head==null){
			return head;
		}
		Node rev=reverse(head);
		int carry=1;
		Node ptr=rev;
		while(ptr!=null){
			int temp=ptr.data+carry;
			if(temp==10){
				ptr.data=0;
				carry=1;
			}
			else{
				ptr.data=temp;
				carry=0;
				break;
			}
			ptr=ptr.next;
		}
		head=reverse(rev);
		if(carry==1){
			Node new1=new Node(1);
			new1.next=head;
			head=new1;
		}
		return head;
	}

	public static Node reverse(Node head){
		if(head==null || head.next==null){
			return head;
		}
		Node curr=head;
		Node prev=null;

		while(curr!=null){
			Node Next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=Next;
		}

		return prev;
    }
}
