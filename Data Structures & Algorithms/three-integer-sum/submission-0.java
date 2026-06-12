class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        int j,k;
        List<List<Integer>> arr= new ArrayList<>();
        LinkedHashSet<List<Integer>> seen= new LinkedHashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                for(k=j+1;k<n;k++){
                int first=nums[i];
                int sec=nums[j];
                int thrid=nums[k];
              
                if((first+sec+thrid)==0){
                    seen.add(List.of(first, sec, thrid));
                }}
            }
        }
      arr.addAll(seen);

        return arr;

    }
}
