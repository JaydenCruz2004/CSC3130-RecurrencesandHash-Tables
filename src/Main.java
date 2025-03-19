public class Main {
    public static void main(String[] args) {

        //Question 5 (code) Radix Sort [15 points] w/ uppercase precedence
        String[] input = {"google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino",
               "amaterasu", "amazon", "puppy", "hydra", "amazonia", "vueltiao"};

        System.out.println("\nQuestion 5:");

        System.out.println("Before sorting:");
        for (String s : input) {
            System.out.print(s + " ");
        }
        RadixSort.radixSort(input);

        System.out.println("\nAfter sorting:");
        for (String s : input) {
            System.out.print(s + " ");

        //Question 6 }}
        }
    }
}
