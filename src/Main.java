import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Question 5 (code) Radix Sort [15 points]
        String[] input = {"google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino",
                "amaterasu", "amazon", "puppy", "hydra", "amazonia", "vueltiao"};
        String[] inputUpper = {"google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino",
                "amaterasu", "amazon", "puppy", "hydra", "amazonia", "Vueltiao"};

        System.out.println("Question 5:");

        System.out.println("Before sorting:");
        for (String s : input) {
            System.out.print(s + " ");
        }
        RadixSort.radixSort(input);

        System.out.println("\nAfter sorting:");
        for (String s : input) {
            System.out.print(s + " ");
        }

        System.out.println(" ");
        System.out.println("\nexample with upper case:");

        System.out.println("Before sorting:");
        for (String s : inputUpper) {
            System.out.print(s + " ");
        }
        RadixSort.radixSort(inputUpper);

        System.out.println("\nAfter sorting:");
        for (String s : inputUpper) {
            System.out.print(s + " ");
        }

        //Question 6 (code) Word Pattern [15 points]
        System.out.println(" ");
        System.out.println("\nQuestion 6:");
        System.out.println(WordPattern.isWordPattern("abba", '?', "dog?cat?cat?dog"));
        System.out.println(WordPattern.isWordPattern("abba", '|', "apple|banana|grape|apple"));
        System.out.println(WordPattern.isWordPattern("aaaa", ',', "dog,cat,cat,dog"));
        System.out.println(WordPattern.isWordPattern("aaaa", ' ', "ice cream taco day"));
        System.out.println(WordPattern.isWordPattern("adxp", ' ', "ice cream taco day"));

        //Extra Credit Problem Subarray [5 points]:
        System.out.println("\nExtra Credit Question: ");

        System.out.println(Arrays.toString(SubarraySum.sumTarget(new int[]{1, 2, 3, 7, 5}, 12)));
        System.out.println(Arrays.toString(SubarraySum.sumTarget(new int[]{1, 2, 3, 7, 5}, 5)));
        System.out.println(Arrays.toString(SubarraySum.sumTarget(new int[]{1, 2, 3, 7, 5}, 7)));
        System.out.println(Arrays.toString(SubarraySum.sumTarget(new int[]{1, 2, 3, 7, 5}, 11)));
    }
}