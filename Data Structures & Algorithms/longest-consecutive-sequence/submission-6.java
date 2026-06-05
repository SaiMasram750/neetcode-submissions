class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1,c1=1;
       if(nums.length==0){
        return 0;
       }
       int n=nums.length;
       for(int i=1;i<n;i++){
     
        if(nums[i]==nums[i-1]+1){
            
            c1++;
        }else if(nums[i]!=nums[i-1]){
          c1=1;
        }
        c=Math.max(c,c1); 
       }
       return c;
    }
}
