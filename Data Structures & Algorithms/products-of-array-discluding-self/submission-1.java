class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] suffix=new int[n];
        int[] prefix=new int[n];
       int[] output=new int[n];
       suffix[0]=1;
       prefix[n-1]=1;
               for(int i=1;i<n;i++){
         suffix[i]=suffix[i-1]*nums[i-1];
           
         }
         for(int i=n-2;i>=0;i--){
            prefix[i]=prefix[i+1]*nums[i+1];
         }
         for(int i=0;i<n;i++){
            output[i]=suffix[i]*prefix[i];
         }
         
          return output;
        }
       
    }

