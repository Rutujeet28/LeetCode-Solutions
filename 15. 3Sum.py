class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()

        for i, a in enumerate(nums):
            if i>0 and a == nums[i-1]:
                continue
            
            left,right = i + 1, len(nums) -1 

            while left < right:
                sum = a + nums[left] + nums[right]

                if sum > 0:
                    right -=1

                elif sum < 0:
                    left += 1
                
                else:
                    result.append([a, nums[left], nums[right]])
                    left += 1

                    

            
        return result
