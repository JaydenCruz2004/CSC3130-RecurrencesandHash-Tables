//extra credit problem
// 290. Word Pattern on leetcode

import java.util.HashMap;
import java.util.Map;

// Resources used:
// https://www.youtube.com/watch?v=dOonV4byDEg
public class SubarraySum {
    public static int[] sumTarget(int[] A, int K) {
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < A.length; end++) {

            currentSum += A[end];

            while (currentSum > K && start <= end) {
                currentSum -= A[start];
                start++;
            }

            if (currentSum == K) {
                return new int[]{start, end};
            }
        }
        return new int[]{-1, -1};
    }

//    public static int[] sumTarget(int[] A, int K) { // this solution was 0(n) for time and space :|
//        Map<Integer, Integer> map = new HashMap<>();
//        int currentSum = 0;
//        map.put(0, -1);
//
//        for (int i = 0; i < A.length; i++) {
//            currentSum += A[i];
//
//            if (map.containsKey(currentSum - K)) {
//                return new int[]{map.get(currentSum - K) + 1, i};
//            }
//
//            map.put(currentSum, i);
//        }
//
//        return new int[]{-1, -1};
//    }
}