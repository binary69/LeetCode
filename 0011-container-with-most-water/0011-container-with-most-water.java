class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int area = 0;

        while (start<end){
            int temp = (Math.min(height[start],height[end]))*(end-start);
            if(height[start]>height[end]){
                end--;
            }else{
                start++;
            }
            area = (temp>area)?temp:area;
        }
        return area;
    }
}