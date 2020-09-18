public class Driver {
    public static void main(String[] args) {
        Inventory1 i1 = new Inventory1();
        i1.sort();
        i1.setSortStrategy(new MergeSort());
        i1.sort();
    }
}
