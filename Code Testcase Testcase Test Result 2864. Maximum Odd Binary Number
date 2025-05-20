class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder result = new StringBuilder();
        int ones = 0;
        int zeros = 0;

        for(char c : s.toCharArray()){
            if(c == '1') ones += 1;
            else zeros += 1;
        }

        for(int i=0;i<ones-1;i++){
            result.append('1');
        }

        for(int i=0;i<zeros;i++){
            result.append('0');
        }

        result.append('1');

        return result.toString();
        
    }
}
