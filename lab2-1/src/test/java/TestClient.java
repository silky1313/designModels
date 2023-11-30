import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestClient {

    @Test
    public void testSortAnd(){
        Random random = new Random();
        DataOperation dataOperation = new DataOperationAdapter();
        ArrayList<Integer> test = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        int length = random.nextInt(10000);
        for(int i = 0; i < length; i++){
            int value =  random.nextInt();
            test.add(value);
            answer.add(value);
        }
        test = dataOperation.sort(test);
        Collections.sort(answer);
        assertEquals(test, answer);
        int find = random.nextInt();

        int index1 = dataOperation.search(test, find);
        int index2 = Collections.binarySearch(answer, find);
        if(index1 < 0){
            index1 = index2 = -1;
        }
        assertEquals(index1, index2);
    }

}
