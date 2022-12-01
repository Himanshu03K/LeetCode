class Solution {
    
    private static int count(String str){
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u' || ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U')
                c++;
        }
        
        return c;
    }
    public boolean halvesAreAlike(String s) {
        int c1=count(s.substring(0,(s.length()/2)));
        int c2= count(s.substring(s.length()/2));
        
        if(c1 == c2)
            return true;
        
        return false;
    }
}