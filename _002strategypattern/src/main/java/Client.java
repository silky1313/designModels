import java.util.Scanner;

/**
 * 本模块主要是实现策略模式
 * 策略模式说白了就是利用一个配置类传入算法对象， 新的对象不会影响到旧的对象
 * 感觉和简单工厂差不多，就是把工厂给去掉了
 * 因为可能一次性生产很多算法类，所以需要一个配置类。
 * 甚至client只需要知道一个配置类即可,然后利用配置去选择算法类。
 * 没有找到策略模式的习题。ji
 * 可以考虑将简单工厂和策略模式结合
 * 这样就可以减去客户端的判断
 */
public class Client {
    //TODO:创建配置类CashContext
    public static void main(String[] args) {
        CashContext cashContext = new CashContext(3);
        double ans = cashContext.getResult(501);
        System.out.println(ans);
    }
}
