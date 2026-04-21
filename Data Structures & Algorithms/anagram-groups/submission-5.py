def CheckAnagram(s, t):
    if len(s) != len(t):
        return False
    else:
        return sorted(s) == sorted(t)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]] :
        anagrams_list = []
        anagrams_gr_list = []
        visited = [False] * len(strs)
        for idx, i in enumerate(strs):
            if visited[idx]: continue
            for k_idx in range(idx, len(strs)):
                k = strs[k_idx]
                if not visited[k_idx] and CheckAnagram(i, k):
                    anagrams_list.append(k)
                    visited[k_idx] = True
            if anagrams_list != []:
                anagrams_gr_list.append(anagrams_list.copy())
                anagrams_list.clear()
        return anagrams_gr_list