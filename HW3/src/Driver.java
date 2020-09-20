import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Convention: <class>- where print originates from");
        System.out.println();
        System.out.println("<driver> Create new Inventory1: \tDefault: BogoSort");
        Inventory1 i1 = new Inventory1();
        //Shuffle numbers 1-10 with python
        Integer[] base = new Integer[]{6, 7, 3, 1, 10, 4, 2, 8, 5, 9};

        //Default sorting (bogo)
        i1.objects = base;
        i1.sort();
        System.out.println("\t" + Arrays.toString(i1.objects));

        //Dynamically set sort strategy
        System.out.println("<driver> Set new Strategy: \tStrategy: QuickSort");
        i1.setSortStrategy(new QuickSort());
        i1.objects = base;
        i1.sort();
        System.out.println("\t" + Arrays.toString(i1.objects));

        //New Inventory object (default = merge)
        System.out.println("<driver> Create new Inventory2: \tDefault: MergeSort");
        Inventory2 i2 = new Inventory2();
        i2.objects = base;
        i2.sort();
        System.out.println("\t" + Arrays.toString(i2.objects));

        //Dynamically set sort strategy (bubble)
        System.out.println("<driver> Set new Strategy: \tStrategy: BubbleSort");
        i2.setSortStrategy(new BubbleSort());
        i2.objects = base;
        i2.sort();
        System.out.println("\t" + Arrays.toString(i2.objects));
    }
}
