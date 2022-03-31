public class Selection {
    public static void sort(int[] input) {
        // iterate over input
        for (int i = 0; i < input.length; i++) {
            // cache min index
            int minIdx = i;

            // look from i to end for smaller number
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIdx]) {
                    minIdx = j;
                }
            }

            // put smallest number to the front
            swap(input, i, minIdx);
        }
    }

    // swaps index a and b
    private static void swap(int[] input, int a, int b) {
        if (a == b)
            return;

        int cache = input[a];
        input[a] = input[b];
        input[b] = cache;
    }
}
