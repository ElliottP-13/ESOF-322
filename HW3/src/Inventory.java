public class Inventory {
    Algorithm sAlg; // the sorting algorithm
    Integer[] objects; // The objects in inventory (can be Comparable object)

    public Inventory(){
        System.out.println("<inventory> New Inventory Object");
    }

    /**
     * Sorts the objects in the inventory using the sorting algorithm
     */
    public void sort(){
        System.out.print("<inventory> Inventory Sort --> ");
        objects = sAlg.sort(objects);
    }

    /**
     * Assign a sorting algorithm
     * @param a
     */
    public void setSortStrategy(Algorithm a){
        System.out.println("Inventory set strategy");
        this.sAlg = a;
    }

}
