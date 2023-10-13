import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        DataOperation dataOperation = new DataOperationAdapter();
        ArrayList<Integer> test = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Integer value =  random.nextInt(10);
            test.add(value);
        }
        test = dataOperation.sort(test);
        Integer find = random.nextInt(10);
        int index = dataOperation.search(test, find);
        for(Integer integer : test){
            System.out.print(integer + " ");
        }
        if(index > 0){
            System.out.println(find + "equals test[" + index + "]");
        }
        else{
            System.out.println("value is not find in test");
        }
    }
}
