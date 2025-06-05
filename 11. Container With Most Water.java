class Solution {
    public int maxArea(int[] height) {
        int maxVolume = 0;
        int left = 0;
        int right = (height.length) - 1;
        int minHeight = Integer.MAX_VALUE;

        while(left<right){
            int currentVolume = (right - left) * Math.min(height[left], height[right]);

            maxVolume = Math.max(maxVolume, currentVolume);

            if(height[left] < height[right]) left += 1;
            else right -= 1;
        }
        return maxVolume;
    }
}
