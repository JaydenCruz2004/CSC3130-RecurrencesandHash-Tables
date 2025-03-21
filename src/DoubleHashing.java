import java.util.Arrays;

public class DoubleHashing {
    private static final int M = 29; // was 13 before re sizing the tabloe
    private static final int EMPTY = -1;
    private int[] hashTable;

    public DoubleHashing() {
        hashTable = new int[M];
        Arrays.fill(hashTable, EMPTY);
    }

    public int h1(int key) {
        int x = (key + 19) * (key + 11);
        x = x / 15;
        x = x + key;
        x = x % M;
        return x;
    }

    public int reverse(int value) {
        String valueStr = Integer.toString(value);
        String reversedStr = new StringBuilder(valueStr).reverse().toString();
        return Integer.parseInt(reversedStr);
    }

    public void insert(int key) {
        int homeSlot = h1(key);
        int collisions = 0;
        int i = 0;
        int probeIndex = homeSlot;
        System.out.println("Inserting key: " + key);
        System.out.println("Home slot: " + homeSlot);

        while (true) {
            probeIndex = (homeSlot + i * reverse(key)) % M;

            if (hashTable[probeIndex] == EMPTY) {
                hashTable[probeIndex] = key;
                if (collisions > 0) {
                    System.out.println("Collisions: " + collisions);
                }
                break;
            } else if (hashTable[probeIndex] == key) {
                System.out.println("Key " + key + " already exists at index " + probeIndex);
                break;
            } else {
                collisions++;
                System.out.println("Collision at index " + probeIndex + " for key " + key);
                i++;

                if (probeIndex == homeSlot) {
                    System.out.println("Infinite loop detected for key " + key + ". Key cannot be inserted.");
                    break;
                }
            }
        }

        System.out.println("Current hash table:");
        displayTable();
    }

    public void displayTable() {
        for (int i = 0; i < M; i++) {
            if (hashTable[i] != EMPTY) {
                System.out.println("Index " + i + ": " + hashTable[i]);
            } else {
                System.out.println("Index " + i + ": EMPTY");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleHashing dh = new DoubleHashing();

        int[] keys = {25, 14, 9, 7, 5, 3, 0, 21, 6, 33, 25, 42, 24, 107};

        for (int key : keys) {
            dh.insert(key);
        }
    }
}
