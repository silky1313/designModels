package Simple3;

import Simple2.Server;

import java.util.Scanner;

/**
 * 主要就是简单工厂的方法
 * 利用OperationFactory 来生产新的计算类。
 * 然后客户端就处理输入问题即可
 */
public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入数字A：");
        String numberA = input.nextLine();

        System.out.println("请输入运算符+ - * /：");
        String operator = input.nextLine();

        System.out.println("请输入数字B：");
        String numberB = input.nextLine();

        Operation operation = OperationFactory.createOperate(operator);
        operation.setNumberA(Double.valueOf(numberA));
        operation.setNumberB(Double.valueOf(numberB));
        double ans = operation.GetResult();
        System.out.println(ans);
    }
}
