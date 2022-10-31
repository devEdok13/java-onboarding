package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    //  자릿수별 덧셈연산, 곱셈연산된 숫자 중 최대값 계산
    private static int findMaxValueInNum(int num) {
        return Math.max(valueByPlus(num), valueByMultiple(num));
    }

    //  입력된 수의 자릿수별 덧셈연산
    private static int valueByPlus(int num) {
        int result = num % 10;
        while (num >= 10) {
            num /= 10;
            result += num % 10;
        }
        return result;
    }

    //  입력된 수의 자릿수별 곱셈연산
    private static int valueByMultiple(int num) {
        int result = num % 10;
        while (num >= 10) {
            num /= 10;
            result *= num % 10;
        }
        return result;
    }
}