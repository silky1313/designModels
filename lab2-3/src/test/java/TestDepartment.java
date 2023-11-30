import java.util.Random;
import org.junit.Test;

public class TestDepartment {
    @Test
    public void testAddRandom(){
        Random random = new Random();
        BaseDepartment root = new CompoundDepartment();
        int length = random.nextInt(10000);
        int leftIndex = 0;

        for(int i = 0; i < length; i++){
            int choose = random.nextInt(2);
            if(choose == 0){
                BaseDepartment left = new LeftDepatment("this index is "+ leftIndex++);
                root.addRandom(left);
            }
            else{
                BaseDepartment node = new CompoundDepartment();
                root.addRandom(node);
            }
        }
        root.send(0);
    }
}
