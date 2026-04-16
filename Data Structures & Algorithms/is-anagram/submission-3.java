class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> firstString = new HashMap<>();
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
}
}

