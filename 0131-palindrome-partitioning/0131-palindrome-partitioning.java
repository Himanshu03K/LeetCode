class Solution {
    public boolean pali(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    public  void Partition(String ques,List<String> ans, List<List<String>> list){

        if(ques.length() == 0) {
            list.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s1 = ques.substring(0,i);
            if(pali(s1)== false)
                continue;
            ans.add(s1);
            Partition(ques.substring(i),ans,list);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<String>> partition(String s) {
        List<String> ans= new ArrayList<>();

        List<List<String>> list= new ArrayList<>();
        Partition(s,ans,list);
        return list;
    }
}