class Solution {
    public int candy(int[] ratings) {
        int[] resultArr = new int[ratings.length];

        Arrays.fill(resultArr, 1);

        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1] < ratings[i]){
                resultArr[i] = resultArr[i-1] + 1;
            }
        }

        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                resultArr[i] = Math.max(resultArr[i], resultArr[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for(int result : resultArr){
            totalCandies += result;
        }

        return totalCandies;
    }
}
