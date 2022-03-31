import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;


class BubbleSort {

    /**
     * The sort() method implements the bubble sort algorithms.
     * 
     * @param list Array containing primitive integers
     */
    public static int[] sort(int[] list) {
        int tmp;
        for(int i = 1; i < list.length; i++) {
            for(int j = 0; j < list.length - 1; j++) {
                if(list[j] > list[j+1]) {
                    tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                }
            }
        }

        return list;
    }

    /**
     * main() method is used for testing purposes.
     * After compiling it can be run via the command line
     * to test the actual behaviour of bubble sort.
     */
    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(BubbleSort.class.getName());

        int[] listIntegers = {9, 23, 3, 79, 5, 1, -9};

        LOGGER.log(Level.INFO, Arrays.stream(listIntegers)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(", ")));
        
        listIntegers = sort(listIntegers);

        LOGGER.log(Level.INFO, Arrays.stream(listIntegers)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(", ")));
    }
}