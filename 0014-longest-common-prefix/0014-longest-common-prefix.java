class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = "";
        for(int i=0; i<strs[0].length();i++){
            for(int j=1;j<strs.length ;j++){
                if(strs[j].length()<=i || strs[j].charAt(i) != strs[0].charAt(i)) return pre;
            }
            pre+=strs[0].charAt(i);
        }
        return pre;
    }
}