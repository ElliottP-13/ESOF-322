import java.util.Arrays;
import java.util.Random;

public class BogoSort implements Algorithm{

    @Override
    public <E extends Comparable<E>> E[] sort(E[] arr) {
        System.out.println("Bogo Sort");

        while (!checkOrder(arr)){
            arr = shuffle(arr);
        }

        return arr;
    }

    private <E extends Comparable<E>> E[] shuffle(E[] arr){
        E[] result = Arrays.copyOf(arr, arr.length);
        int index;
        Random rand = new Random();
        for (int i = result.length - 1; i > 0; i--) { //Fisher-Yates Shuffle
            index = rand.nextInt(i + 1);
            E temp = result[index];
            result[index] = result[i];
            result[i] = temp;
        }
        return result;
    }

    private <E extends Comparable<E>> boolean checkOrder(E[] arr){

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1].compareTo(arr[i]) > 0) //If arr[i-1] > arr[i] --> return false (out of order)
                return false;
        }

        return true;
    }
}
