class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left=1;
        int right=1;
       int[] output=new int[n];
        for(int i=0;i<n;i++){
            output[i]=1;
         for(int j=0;j<i;j++){
           output[i]*=nums[j];
           
           }
           for(int k=i+1;k<n;k++){
            output[i]*=nums[k];
           }
           
         }
          return output;
        }
       
    }

