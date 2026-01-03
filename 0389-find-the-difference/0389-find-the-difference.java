class Solution {
    public char findTheDifference(String s, String t) {
       int XOR = 0;
       for(char c: s.toCharArray()) XOR ^=c;
       for(char c: t.toCharArray()) XOR ^=c;

       return (char)XOR;
    }
}