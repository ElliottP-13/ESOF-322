import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuickSort implements Algorithm{
    @Override
    public <E extends Comparable<E>> E[] sort(E[] arr) {
        System.out.println("Quick Sort");

        ArrayList<E> l = new ArrayList<E>();
        Collections.addAll(l, arr);

        l = quickSort(l);
        E[] blankArr = (E[]) new Object[l.size()];

        return l.toArray(blankArr);
    }

    private <E extends Comparable<E>> ArrayList<E> quickSort(ArrayList<E> list){
        if(list.size() == 1)
            return list;

        ArrayList<E> l = new ArrayList<>();
        ArrayList<E> e = new ArrayList<>();
        ArrayList<E> g = new ArrayList<>();

        Random r = new Random();

        E pivot = list.get(r.nextInt(list.size()));

        for(E x : list){
            int v = x.compareTo(pivot);
            if(v > 0){
                g.add(x);
            } else if(v < 0){
                l.add(x);
            } else{
                e.add(x);
            }
        }

        l = quickSort(l);
        g = quickSort(g);
        ArrayList<E> retMe = new ArrayList<>();
        retMe.addAll(l);
        retMe.addAll(e);
        retMe.addAll(g);

        return retMe;
    }

}
