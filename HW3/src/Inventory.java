public class Inventory {
    Algorithm sAlg;
    Integer[] objects;

    public void sort(){
        sAlg.sort(objects);
    }

    public void setSortStrategy(Algorithm a){
        this.sAlg = a;
    }

}
