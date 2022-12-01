class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       Stack<Integer> st = new Stack<>();
       int index = 0;
       for(int i : pushed){
           st.push(i);
           while (!st.empty() && st.peek() == popped[index]){
               st.pop();
               index++;
           }
       }
       return st.empty();
    }
}