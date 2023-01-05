//{ Driver Code Starts
import java.util.Scanner;
import java.io.*;
class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}
class GFG2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node start1=null,cur1=null,start2=null,cur2=null;
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start1==null)
                {
                    start1=ptr;
                    cur1=ptr;
                }
                else{
                    cur1.next=ptr;
                    cur1=ptr;
                }
            }
            n=sc.nextInt();
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start2==null)
                {
                    start2=ptr;
                    cur2=ptr;
                }
                else{
                    cur2.next=ptr;
                    cur2=ptr;
                }
            }
            Solution obj=new Solution();
            Node sum = obj.addPolynomial(start1,start2);
            for(Node ptr=sum ; ptr != null; ptr=ptr.next  )
            {
                // printing polynomial
                System.out.print(ptr.coeff + "x^" + ptr.pow);
                if(ptr.next != null)
                System.out.print(" + ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}*/

//Print the polynomial formed by adding both LL in the function itself.
class Solution
{
    public static Node addPolynomial(Node p1,Node p2)
    {
        //Add your code here.
        Node dummyHead = new Node(0,0);
        Node node = dummyHead;
        Node node1 = p1, node2 = p2;
        while (node1 != null && node2 != null) {
            if (node1.pow == node2.pow) {
                int nextcoeff = node1.coeff + node2.coeff;
                int nextpow = node1.pow;
                if (nextcoeff != 0) {
                    Node nextNode = new Node(nextcoeff, nextpow);
                    node.next = nextNode;
                    node = node.next;
                }
                node1 = node1.next;
                node2 = node2.next;
            } else if (node1.pow > node2.pow) {
                Node nextNode = new Node(node1.coeff, node1.pow);
                node.next = nextNode;
                node = node.next;
                node1 = node1.next;
            } else {
                Node nextNode = new Node(node2.coeff, node2.pow);
                node.next = nextNode;
                node = node.next;
                node2 = node2.next;
            }
        }
        if (node1 != null)
            node.next = node1;
        else if (node2 != null)
            node.next = node2;
        return dummyHead.next;
    }
}