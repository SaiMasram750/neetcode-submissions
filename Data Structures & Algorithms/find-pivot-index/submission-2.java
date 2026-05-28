class Solution {
    public int pivotIndex(int[] nums) {
      
        int n=nums.length;
        int[] arr=new int[n+1];
        int left,right;
        for(int i=0;i<n;i++){
              
              arr[i+1]=arr[i]+nums[i];
        }
        for(int i=0;i<n;i++){
         left=arr[i];
         right=arr[n]-arr[i+1];
         if(right==left){
            return i;
         }
        }
        
        return -1;
    }
}