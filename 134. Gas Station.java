class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        for(int i=0;i<gas.length;i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        int total = 0;
        int result = 0;

        for(int i=0;i<gas.length;i++){
            total += gas[i] - cost[i];

            if(total <= 0){
                total = 0;
                result = i + 1;
            }
        }

        return (totalGas < totalCost) ? -1 : result;
    }
}
