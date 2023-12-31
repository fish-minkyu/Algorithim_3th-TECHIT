package programmers;// 홀짝에 따라 다른 값 반환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181935?language=java


class Solution181935 {
  public int solution(int n) {
    int odd = 0, even = 0;
    // 반복문으로 n까지의 정수를 홀수와 짝수로 나눠 담는다.
    for (int i = 1; i <= n; i++) {
     if ( i % 2 == 1) {
       odd += i;
     } else {
       even += i * i;
     }
    }

    // n이 홀수면 홀수합을 짝수면 짝수조건에 맞는 result를 준다.
    return n % 2 == 1 ? odd : even;
  }
}