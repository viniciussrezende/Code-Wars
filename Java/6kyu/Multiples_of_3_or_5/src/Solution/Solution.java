package Solution;

public class Solution {
    public int solution(int number) {
        int sum = 0;
        for(int counter = 1; counter < number; counter++){
            if((counter % 3 == 0) || (counter % 5 == 0)){
                sum += counter;
            }
        }
        return sum;
    }
}