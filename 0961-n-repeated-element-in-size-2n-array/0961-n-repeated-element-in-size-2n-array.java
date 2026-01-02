class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> numsCount = new HashMap<>();

        for(int n:nums){
            numsCount.put(n, numsCount.getOrDefault(n,0)+1);
        }  

        int result = -1;
        for(Map.Entry<Integer,Integer> entry: numsCount.entrySet()){
            if(entry.getValue() == nums.length/2){
                result = entry.getKey();
                break;
            } 
        }
        return result;
    }
}