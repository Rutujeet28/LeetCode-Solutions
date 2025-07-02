class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Double.NEGATIVE_INFINITY;

        for(int i=0;i<=nums.length - k;i++){
            double sum = 0;
            for(int j=i;j<i+k;j++){
                sum += nums[j];
            }
            result = Math.max(result, sum / k);
        }
        return result;
    }
    
}
