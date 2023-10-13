package Simple2;

import java.util.Scanner;
/**
 * 简单的客户端代码
 * 暂未实现显示和业务代码分离
 */

public class Client {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Server Count = new Server();

            System.out.println("请输入数字A：");
            String numberA = input.nextLine();

            System.out.println("请输入运算符+ - * /：");
            String operation = input.nextLine();

            System.out.println("请输入数字B：");
            String numberB = input.nextLine();

            String result = Count.getResult(numberA, numberB, operation);
            System.out.println("计算结果为：" + result);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
