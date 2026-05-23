class Solution {
    public int[] replaceElements(int[] arr) {
        int i=0,res;
        int n=arr.length;
        int k=n-1;
        for(i=0;i<n;i++){
            res=0;
            for(int j=i+1;j<n;j++){
              res=Math.max(res,arr[j]);
            }
            arr[i]=res;
        }
        arr[n-1]=-1;
        return arr;
    }
}