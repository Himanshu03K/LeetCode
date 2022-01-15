class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0"; 
		
		
        int[] ans=new int[num1.length() + num2.length()];
        
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                
             int  valInd=i + j +1;
             int  remInd=i+ j ;
             int pow=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                
			 
             pow+=ans[valInd];
             
			 ans[valInd]=pow%10;
			 
             ans[remInd]+=pow/10;  
                
            }
       }
        
        boolean preZero=true;
        StringBuilder res=new StringBuilder();
      
        for(int i=0;i<ans.length;i++){
         int value=ans[i];
         if(value!=0) 
             preZero=false;
         if(!preZero) 
             res.append(value);
     }
        
        return res.toString();
    }
}
