class Solution {
    public boolean isSubsequence(String s, String t) {
        int first = 0;
        int sec = 0;
        while(first < s.length() && sec < t.length()){
            if(s.charAt(first) == t.charAt(sec)){
                first++;
            }
            sec++;
        }
        return first == s.length();
    }
}