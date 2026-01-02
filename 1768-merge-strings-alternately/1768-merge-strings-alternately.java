class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        for(int i=0; i<word1.length() && i<word2.length(); i++) merged.append(word1.charAt(i)).append(word2.charAt(i));

        if(merged.length()/2<word1.length()) merged.append(word1.substring(merged.length()/2));
        else if(merged.length()/2<word2.length()) merged.append(word2.substring(merged.length()/2));
        return merged.toString();
    }
}