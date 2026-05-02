class Solution {
    public boolean isAnagram(String s, String t) {
        int n=t.length();
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<=n-1;i++){
              if(char1[i]!=char2[i]){
            return false;

              }
        }
        return true;
    }
}