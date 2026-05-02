class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
        
        String key = buildFrequencyKey(s); 
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(s);
    }
    
    return new ArrayList<>(map.values());
    }}
    public String  buildFrequencyKey(String S){
        int[] count=new int[26];
        for(char c:S.toCharArray()){
            count[c - 'a']++;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<26;i++){
            if(count[i]>0){
                sb.append((char)(i + 'a')).append(count[i]);
            }
        }
       return sb.toString();
}
