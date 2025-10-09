/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while(left <= right){
           int middle = left + (right - left) / 2;
            int resAPI = guess(middle);
            if(resAPI > 0){
                left = middle + 1;
            }
            else if(resAPI < 0){
                right = middle - 1;
            }
            else return middle;
        }
        return -1;
    }
}
