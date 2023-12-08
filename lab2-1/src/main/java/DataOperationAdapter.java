import java.util.ArrayList;

public class DataOperationAdapter implements DataOperation {
    public BinarySearch binarySearch;
    public QuickSort quickSort;

    public DataOperationAdapter() {
        binarySearch = new BinarySearch();
        quickSort = new QuickSort();
    }


    @Override
    public ArrayList sort(ArrayList<Integer> array) {
        return quickSort.quickSort(array);
    }

    @Override
    public Integer search(ArrayList<Integer> array, Integer value) {
        return binarySearch.binarySearch(array, value);
    }
}
