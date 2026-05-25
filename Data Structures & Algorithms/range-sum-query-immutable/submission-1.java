class NumArray {
    private int[] PrefixSum;
    public NumArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] +=nums[i-1];
        }
        this.PrefixSum=nums;
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
          return PrefixSum[right];
        }
        return PrefixSum[right]-PrefixSum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */