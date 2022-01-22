class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans=new StringBuilder();
        
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        
        while(i>=0 || j>=0){
            int sum=carry;
            
            if(i>=0)
                sum+=a.charAt(i--)-'0';
            if(j>=0) 
                sum+=b.charAt(j--)-'0';
            if(sum==2){
            ans.append(0);
            carry=1;
            }
            else if(sum==3){
            ans.append(1);
            carry=1;
            }
            else{
                ans.append(sum);
                carry=0;
            }
        }
        if(carry>0) 
            ans.append(carry);
        return ans.reverse().toString();
        
    }
}
