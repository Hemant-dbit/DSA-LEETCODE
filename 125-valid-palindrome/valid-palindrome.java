class Solution {
    public boolean isPalindrome(String s) {
        String w = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        int k = w.length() - 1;
        int i =0;
        while(i < k){
            if(w.charAt(i) != w.charAt(k)){
                return false;
            }
            i++;
            k--;
        }
        return true;
    }
}