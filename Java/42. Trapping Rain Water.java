class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int totalVolume = 0;
        int maxLeft = height[left];
        int maxRight = height[right];

        if(height == null) return 0;

        while(left<right){
            if(maxLeft<maxRight){
                left += 1;
                maxLeft = Math.max(maxLeft, height[left]);
                totalVolume += maxLeft - height[left];
            }
            else{
                right -= 1;
                maxRight = Math.max(maxRight, height[right]);
                totalVolume += maxRight - height[right];
            }
        }
        return totalVolume;
    }
}
