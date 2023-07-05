class Solution {
   
    public static class Node {
        Node zero;
        Node one;

    }
    public static void Insert(Node root,int val){
Node curr= root;
for (int i = 31; i >= 0; i--) {
    if((val&(1<<i))==0){//check if particular bit is one or not 
if(curr.zero!=null){
    curr=curr.zero;
}
else{
    Node nn= new Node();
    curr.zero= nn;
    curr= nn;
}
}
else{
    if(curr.one!=null){
    curr=curr.one;
}
else{
    Node nn= new Node();
    curr.one= nn;
    curr= nn;
    }
  }
}
}

public static int getmaxXor(Node root,int val){
    int num=0;
    Node curr= root;
    for (int i = 31; i >= 0; i--) {
        int bit=(val&(1<<i));
        if(bit==0){
            if(curr.one!=null){
                num+=(1<<i);
                curr=curr.one;
            }
            else{
                curr=curr.zero;
            }
        }
        else{
if(curr.zero!=null){
     num+=(1<<i);
     curr=curr.zero;
}
else{
        curr=curr.one;
}
        }
    }
    return num;
}
 public int findMaximumXOR(int[] nums) {
         Node root= new Node();
          for(int val:nums){
        Insert(root ,val);
    }
    int xor=Integer.MIN_VALUE;
    for(int val:nums){
        xor=Math.max(xor,getmaxXor(root, val));
    }
return xor;
    }
}