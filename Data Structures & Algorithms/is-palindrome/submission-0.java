class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb=new StringBuilder("");
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n=str.length();
        for(int i=n-1;i>=0;i--){
           sb.append(str.charAt(i));
        }
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }
        return false;
    }
}
