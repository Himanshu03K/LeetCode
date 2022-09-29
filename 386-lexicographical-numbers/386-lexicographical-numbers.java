class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        return lexicoCounting(0,n,list);
    }
    
     private static List<Integer> lexicoCounting(int curr, int n,List<Integer> list){
        if(curr >n )
            return list;
         if(curr !=0)
        list.add(curr);

        int i=0;
        if(curr == 0)
            i=1;

        for (;i<=9;i++){
            lexicoCounting(curr*10+i,n,list);
        }
         
         return list;
    }
}