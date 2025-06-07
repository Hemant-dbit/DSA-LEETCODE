class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        if(len <= 2) return "";
        char[] c = s.toCharArray();
        int open =0;

        for(int i = 0;i<len;i++){
            if(c[i] == '('){
                open++;
                if(open > 1) sb.append('(');
            }else{
                open--;
                if(open > 0) sb.append(')');
            }
        }
        return sb.toString();
    }
}