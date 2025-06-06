class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length - 1;
        int goal = n;

        for (int i = n-1; i >= 0; i--) {
            if(i + nums[i] >= goal){
                goal = i;
            }
        }

       return  (goal == 0);
    }
}
