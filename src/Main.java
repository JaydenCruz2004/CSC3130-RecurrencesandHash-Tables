public class Main {
    public static void main(String[] args) {

        //Question 5 (code) Radix Sort [15 points] w/ uppercase precedence
        String[] input = {"google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino",
                "amaterasu", "amazon", "puppy", "hydra", "amazonia", "vueltiao"};

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

        //Question 6 (code) Word Pattern [15 points]
        System.out.println(" ");
        System.out.println("\nQuestion 6:");
        System.out.println(WordPattern.isWordPattern("abba", '?', "dog?cat?cat?dog"));
        System.out.println(WordPattern.isWordPattern("abba", '|', "apple|banana|grape|apple"));
        System.out.println(WordPattern.isWordPattern("aaaa", ',', "dog,cat,cat,dog"));
        System.out.println(WordPattern.isWordPattern("aaaa", ' ', "ice cream taco day"));
        System.out.println(WordPattern.isWordPattern("adxp", ' ', "ice cream taco day"));
        }
    }