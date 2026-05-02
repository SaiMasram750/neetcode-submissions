class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet dup=new HashSet<>();
        for(int i=0;i<=nums.length-1;i++){
            if(dup.contains(nums[i])){
                return true;
            }else{
                dup.add(nums[i]);
            }
        }
        return false;
    }
}