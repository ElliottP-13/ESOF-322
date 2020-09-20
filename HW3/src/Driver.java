import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Inventory1 i1 = new Inventory1();
        //Shuffle numbers 1-20 with python
        Integer[] base = new Integer[]{6, 7, 3, 1, 10, 4, 2, 8, 5, 9};
        i1.objects = base;
        i1.sort();
        System.out.println(Arrays.toString(i1.objects));
        i1.setSortStrategy(new QuickSort());
        i1.objects = base;
        i1.sort();
        System.out.println(Arrays.toString(i1.objects));
        i1.setSortStrategy(new MergeSort());
        i1.objects = base;
        i1.sort();
        System.out.println(Arrays.toString(i1.objects));
        i1.setSortStrategy(new BubbleSort());
        i1.objects = base;
        i1.sort();
        System.out.println(Arrays.toString(i1.objects));
    }
}
