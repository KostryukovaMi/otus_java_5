import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Homework5 {

    public static void main(String[] args) {
        final int N = 1000;
        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.println("Исходный массив:");
        for (int i = 0; i < N; i++) {
            array.add(i,(int) (Math.random()*(200+1))-100);
            System.out.print(array.get(i) + " ");
        }
        System.out.println("");
        System.out.println("");

        Sort sort = new Sort(array);
        long start = new Date().getTime();
        sort.selectionSort();
        long end = new Date().getTime();

        sort.print();
        System.out.println("");

        System.out.println("Время сортировки выбором: " + (end-start) + " ms");

        start = new Date().getTime();
        Collections.sort(array);
        end = new Date().getTime();

        System.out.println("Время быстрой сортировки: " + (end-start) + " ms");
    }
}
