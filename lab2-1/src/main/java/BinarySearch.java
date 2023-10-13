import java.util.ArrayList;

public class BinarySearch {
    public Integer binarySearch(ArrayList<Integer>array, Integer value){
        int l = 0, r = array.size() - 1;
        while(l <= r){
            int mid = l + r >> 1;
            if(array.get(mid) == value) return mid;
            else if(array.get(mid) < value) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}
