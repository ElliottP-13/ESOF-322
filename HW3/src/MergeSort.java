import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort implements Algorithm{
    @Override
    public <E extends Comparable<E>> E[] sort(E[] arr) {
        System.out.println("Merge Sort");
        E[] copy = Arrays.copyOf(arr, arr.length);
        return mergeSort(copy);
    }

    private <E extends Comparable<E>> E[] mergeSort(E[] arr){
        if(arr.length <= 1)
            return arr;

        int mid = arr.length/2;

        E[] a1 = Arrays.copyOfRange(arr, 0, mid);
        E[] a2 = Arrays.copyOfRange(arr, mid, arr.length);

        a1 = mergeSort(a1);
        a2 = mergeSort(a2);
        arr = merge(a1, a2);

        return arr;
    }

    private <E extends Comparable<E>> E[] merge(E[] a1, E[] a2){
        E[] basetype = Arrays.copyOf(a1, a1.length);
        ArrayList<E> comb = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < a1.length && i2 < a2.length){
            if(a1[i1].compareTo(a2[i2]) < 0){
                comb.add(a1[i1]);
                i1++;
            }else{
                comb.add(a2[i2]);
                i2++;
            }
        }

        //add remaining elements
        if(i1 < a1.length){
            for (int i = 0; i1 < a1.length; i1++) {
                comb.add(a1[i1]);
            }
        }

        if(i2 < a2.length){
            for (int i = 0; i2 < a2.length; i2++) {
                comb.add(a2[i2]);
            }
        }

        return comb.toArray(basetype);
    }

}
