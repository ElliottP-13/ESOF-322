import java.util.Arrays;

public class BubbleSort implements Algorithm{
    /**
     * Basic bubble sort implementation
     * O(n^2)
     * @param arr
     * @param <E>
     * @return
     */
    public <E extends Comparable<E>> E[] sort(E[] arr) {
        System.out.println("<bubblesort> Bubble Sort");
        E[] c = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if(c[j].compareTo(c[j+1]) > 0){ //Swap them
                    E temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                } else{ // speed it up slightly
                    break;
                }
            }
        }

        return c;
    }
}
