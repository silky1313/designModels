import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    @Test
    public void test() {
        Random random = new Random();
        DataOperation dataOperation = new DataOperationAdapter();
        ArrayList<Integer> test = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int length = random.nextInt(10000);

        int find;
        int index1;
        for (find = 0; find < length; ++find) {
            index1 = random.nextInt();
            test.add(index1);
            answer.add(index1);
        }

        test = dataOperation.sort(test);
        Collections.sort(answer);
        Assert.assertEquals(test, answer);
        find = random.nextInt();
        index1 = dataOperation.search(test, find);
        int index2 = Collections.binarySearch(answer, find);
        if (index1 < 0) {
            index2 = -1;
            index1 = -1;
        }

        Assert.assertEquals((long)index1, (long)index2);
    }
}
