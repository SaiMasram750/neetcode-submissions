class Solution {
    public int calPoints(String[] operations) {
   Deque<Integer> st=new ArrayDeque<>();
   int n=operations.length;
   int sum=0,x1,x2;
        for(int i=0;i<n;i++){
            if(operations[i].equals("+")){
                x1=st.pop();
                x2=st.peek();
                st.push(x1);
                st.push(x1+x2);
            }else if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }else{
        st.push(Integer.parseInt(operations[i]));

            }
        }
        while(!st.isEmpty()){
      sum+=st.pop();
        }
        return sum;
    }
}