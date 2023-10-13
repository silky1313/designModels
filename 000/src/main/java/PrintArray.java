import java.util.Arrays;

public class PrintArray {
    public void arrayToString(){
        String [] cmowers = {"沉默","王二","一枚有趣的程序员"};
        System.out.println(Arrays.toString(cmowers));
    }

    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();
        printArray.arrayToString();
    }
}
