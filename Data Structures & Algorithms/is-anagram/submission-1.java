class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> firstString = new HashMap<>();
        if(s.length()!= t.length()){
            return false;
        }
        for(char c: s.toCharArray()){
            firstString.put(c,firstString.getOrDefault(c, 0) + 1);
        }
        for(char c: t.toCharArray()){
            firstString.put(c,firstString.getOrDefault(c, 0) - 1);
        }
        for (int v : firstString.values()) {
            if(v != 0){
                return false;
            }
        };
        return true;
    }
}

