import java.awt.event.WindowFocusListener;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(solution(n));
    }
    public static int solution(int n){
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                answer ++;
            }
        }
        return answer;
    }
}