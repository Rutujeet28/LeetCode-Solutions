class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        # result = 0
        # n = len(cost)

        # if n == 1:
        #     return cost[0]

        # if n == 2:
        #     return min(cost[0], cost[1])

        # for i in range(2, n-1):
        #     result = result + min(cost[n-i], cost[n-i-1])
        #     i = i + 1

        # return result    

        prev2 = cost[0]
        prev1 = cost[1]

        n = len(cost)

        for i in range(2,n):
            curr = cost[i] + min(prev1, prev2)
            prev2 = prev1
            prev1 = curr

        return min(prev1, prev2)



        
