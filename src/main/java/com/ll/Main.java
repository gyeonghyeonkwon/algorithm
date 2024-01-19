package com.ll;

public class Main {
    public static void main(String[] args) {

        Solution solution1 = new Solution();

        System.out.println(solution1.solution("tests", "ana"));
        System.out.println(solution1.solution("tests2", "ana"));
        System.out.println(solution1.solution("tests3", "ana"));


    }
}


class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;

        if (my_string.contains(target)){
            answer++;
        }


        return answer;
    }
}
