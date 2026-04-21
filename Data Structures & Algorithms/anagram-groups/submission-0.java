class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hasMap = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!hasMap.containsKey(key)) {
                hasMap.put(key, new ArrayList<>());
            }
            hasMap.get(key).add(s);
        }
        return new ArrayList<>(hasMap.values());
    }
}