import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public ArrayList quickSort(ArrayList<Integer> array){
        if (array.size() <= 1) {
            return array;
        }

        int pivot = array.get(array.size() / 2);
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();

        for (int num : array) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        ArrayList<Integer> sortedArray = new ArrayList<>();
        sortedArray.addAll(quickSort(less));
        sortedArray.addAll(equal);
        sortedArray.addAll(quickSort(greater));
        return sortedArray;
    }
}
