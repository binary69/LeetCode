class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> vals = new HashMap<>();
        for(char c: s.toCharArray()) vals.put(c, vals.getOrDefault(c,0)+1);
        for(char c: t.toCharArray()){
            if(vals.getOrDefault(c,0)==0) return c;
            vals.put(c,vals.get(c)-1);
        }
        return '\0';
    }
}