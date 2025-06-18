class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while(n>0){
            int q = n / 2;
            int r = n % 2;
            if (r==1) count++;
            n = q;
        }

        return count;
    }
}
