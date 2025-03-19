//extra credit problem
// 290. Word Pattern on leetcode
import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static int[] sumTarget(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        map.put(0, -1);

        for (int i = 0; i < A.length; i++) {
            currentSum += A[i];

            if (map.containsKey(currentSum - K)) {
                return new int[]{map.get(currentSum - K) + 1, i};
            }

            map.put(currentSum, i);
        }

        return new int[]{-1, -1};
    }
}