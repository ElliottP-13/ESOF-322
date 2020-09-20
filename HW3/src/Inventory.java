public class Inventory {
    Algorithm sAlg; // the sorting algorithm
    Integer[] objects; // The objects in inventory (can be Comparable object)

    /**
     * Sorts the objects in the inventory using the sorting algorithm
     */
    public void sort(){
        objects = sAlg.sort(objects);
    }

    /**
     * Assign a sorting algorithm
     * @param a
     */
    public void setSortStrategy(Algorithm a){
        this.sAlg = a;
    }

}
