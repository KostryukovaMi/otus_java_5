import java.util.ArrayList;

public class Sort {
    private ArrayList<Integer> array;

    public Sort(ArrayList<Integer> array)
    {
        this.array = array;
    }

    public void selectionSort()
    {
        int nMin, min;
        for (int i = 0; i < array.size()-1; i++) {
            nMin = i;
            min = array.get(i);
            for (int j = i+1; j < array.size(); j++) {
                if (min> array.get(j))
                {
                    min = array.get(j);
                    nMin = j;
                }
            }
            array.set(nMin,array.get(i));
            array.set(i,min);
        }
    }

    public void print()
    {
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println("");
    }

}
