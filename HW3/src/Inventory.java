public class Inventory {
    Algorithm sAlg;
    Integer[] objects;

    public void sort(){
        objects = sAlg.sort(objects);
    }

    public void setSortStrategy(Algorithm a){
        this.sAlg = a;
    }

}
