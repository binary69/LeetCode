class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> vals = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(vals.contains(nums[i])) return true;
            vals.add(nums[i]);
            if(vals.size()>k)vals.remove(nums[i-k]);
        }
        return false;
    }
}