class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        
        List<List<Integer>> res=new ArrayList<>();
        LinkedHashSet<List<Integer>> seen= new LinkedHashSet<>();
       Arrays.sort(nums);
        int i=0;
        for(i=0;i<n;i++){
            
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=n-1;
        while(j<k){
            int target=nums[i]+nums[j]+nums[k];
            
           if(target>0){
           k--;
         
           }else if(target<0){
            j++;
           }else if(target==0){
             res.add(Arrays.asList(nums[i],nums[j],nums[k]));
             j++;
             k--;
             while(j<k&&nums[j]==nums[j-1]){
                j++;
             }
           }     
        
          }  }
            //res.addAll(seen);
        return res;
    }
}
