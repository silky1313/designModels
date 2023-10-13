package extendsingleton;



/**
 * 单例池
 * 总共三个可以使用之后释放掉
* */
public class Client {
    public static void main(String[] args) {
        Window windowFirst = Window.getInstance();;
        windowFirst.setVisible(true);
    }
}

