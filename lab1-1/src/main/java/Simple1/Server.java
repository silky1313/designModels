package Simple1;

import java.util.Scanner;
/**
 * 简单的客户端代码
 * 暂未实现显示和业务代码分离
 */

public class Server {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入数字A：");
        String numberA = input.nextLine();

        System.out.println("请输入运算符+ - * /：");
        String operation = input.nextLine();

        System.out.println("请输入数字B：");
        String numberB = input.nextLine();

        double result = 0;

        switch(operation){
            case "+":
                result = Double.valueOf(numberA) + Double.valueOf(numberB);
                break;
            case "-":
                result = Double.valueOf(numberA) - Double.valueOf(numberB);
                break;
            case "*":
                result = Double.valueOf(numberA) * Double.valueOf(numberB);
                break;
            case "/":
                try{
                    if(Math.abs(Double.valueOf(numberB) - 0) < 1e-6){
                        throw new ArithmeticException("除数不能为0");
                    }
                    result = Double.valueOf(numberA) / Double.valueOf(numberB);
                } catch(ArithmeticException e) {
                    System.out.println(e.getMessage());
                };
                break;
        }
        System.out.println("计算结果为：" + result);
    }
}
