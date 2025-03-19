import java.util.ArrayList;
import java.util.List;


public class RadixSort {
    public static void radixSort(String[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int maxLen = 0;
        for (String s : arr) {
            if (s.length() > maxLen) {
                maxLen = s.length();
            }
        }

        for (int i = maxLen - 1; i >= 0; i--) {
            CountingSort(arr, i);
        }
    }

    private static void CountingSort(String[] arr, int index) {
        List<String>[] buckets = new ArrayList[256];
        for (int i = 0; i < 256; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (String s : arr) {
            char key = '\0';
            if (index < s.length()) {
                key = s.charAt(index);
            }
            buckets[key].add(s);
        }

        int idx = 0;
        for (int i = 0; i < 256; i++) {
            for (String s : buckets[i]) {
                arr[idx++] = s;
            }
        }
    }

//    public static void main(String[] args) {
//        String[] input = {"google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino",
//                "amaterasu", "amazon", "puppy", "hydra", "amazonia", "vueltiao"};
//
//        radixSort(input);
//        for (int i = 0; i < input.length; i++) {
//            System.out.print(input[i]);
//            if (i < input.length - 1) System.out.print(", ");
//        }
//    }
}

