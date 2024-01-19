package com.ll;

public class Main {
    public static void main(String[] args) {

        Solution solution  = new Solution();

        int [] numbers = new int[] {34, 5, 71, 29, 100, 34};

        int n = 123;

        System.out.println(solution.solution(numbers , n));
    }

}

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i =0; i < numbers.length; i++) {
            answer += numbers[i];

            if (answer > n) {
                return answer;

            }

        }
        return answer;
    }
}

