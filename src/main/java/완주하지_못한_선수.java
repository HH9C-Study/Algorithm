import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> failure = new HashMap<>();

        for (String p : participant) {
            failure.put(p, failure.getOrDefault(p, 0)+1);
        }

        for (String c : completion) {
            failure.put(c, failure.get(c) - 1);
        }

        for (String key : failure.keySet()) {
            if (failure.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
