import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Inventory1 i1 = new Inventory1();
        //Shuffle numbers 1-10 with python
        Integer[] base = new Integer[]{6, 7, 3, 1, 10, 4, 2, 8, 5, 9};

        //Default sorting (bogo)
        i1.objects = base;
        i1.sort();
        System.out.println(Arrays.toString(i1.objects));

        //Dynamically set sort strategy
        i1.setSortStrategy(new QuickSort());
        i1.objects = base;
        i1.sort();
        System.out.println(Arrays.toString(i1.objects));

        //New Inventory object (default = merge)
        Inventory2 i2 = new Inventory2();
        i2.objects = base;
        i2.sort();
        System.out.println(Arrays.toString(i2.objects));

        //Dynamically set sort strategy (bubble)
        i2.setSortStrategy(new BubbleSort());
        i2.objects = base;
        i2.sort();
        System.out.println(Arrays.toString(i2.objects));
    }
}
