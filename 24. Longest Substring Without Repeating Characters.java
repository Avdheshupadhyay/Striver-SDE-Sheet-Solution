
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int ans = 0, left = 0,subLen=0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left++));
            }
           subLen = right - left + 1;
            set.add(ch);
            ans = Math.max(ans,subLen);
        }
        return ans;
    }
}