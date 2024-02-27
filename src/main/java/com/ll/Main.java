package com.ll;

public class Main {
    public static void main(String[] args) {

        Solution solution  = new Solution();

        int [] num_list = new int[] {1,2,3,4,5 }; //50 추가

        int n = 3;

        System.out.println(solution.solution(num_list , n));
    }

}

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for (int i : num_list) {

            if (i == n) {
              return  1;
            }
        }
        return answer;
    }
}



