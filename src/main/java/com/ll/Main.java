package com.ll;

public class Main {
    public static void main(String[] args) {

        Solution solution1 = new Solution();


        System.out.println(solution1.solution("banana", "ana"));
        System.out.println(solution1.solution("apple", "ple"));

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
