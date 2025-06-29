class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(i > 0 && nums[i] == nums[i -1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum > 0) right -= 1;
                else if(sum < 0) left += 1;

                else{
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left += 1;
                    right -= 1;

                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                    
                }
            }
        }
        
        return result;

    }
}
