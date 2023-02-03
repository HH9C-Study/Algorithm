import java.util.*;

class Scratch {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution.solution(N, stages)));
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // reach 0 = 1 stage
        int[] reachPeople = new int[N]; // 스테이지에 도달한 사람의 수
        int[] stagePeople = new int[N]; // 스테이지에 머물고 있는 사람의 수
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) {
                for (int k = 0; k < N; k++) {
                    reachPeople[k]++;
                }
            } else {
                stagePeople[stages[i] - 1]++;
                for (int j = 0; j < stages[i]; j++) {
                    reachPeople[j]++;
                }
            }
        }

        List<Double> failureRate = new ArrayList<>();
        for (int a = 0; a < N; a++) {
            if (reachPeople[a] == 0) {
                failureRate.add(a, 0.0);
            } else {
                failureRate.add(a, (double) stagePeople[a] / (double) reachPeople[a]);
            }
        }

        for (int b = 0; b < N; b++) {
            answer[b] = failureRate.indexOf(Collections.max(failureRate)) + 1;
            failureRate.set(failureRate.indexOf(Collections.max(failureRate)), -1.0);
        }

        return answer;
    }
}
