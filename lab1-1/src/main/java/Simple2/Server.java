package Simple2;
/**
 * 计划实现显示与业务代码分离
 * 实现业务封装
 * 这应该就是两个类分离的写法
 */
public class Server {
    public String getResult(String numberA, String numberB, String operation) throws ArithmeticException{
        String result = "";
        switch(operation){
            case "+":
                result = String.valueOf(Double.valueOf(numberA) + Double.valueOf(numberB));
                break;
            case "-":
                result = String.valueOf(Double.valueOf(numberA) - Double.valueOf(numberB));
                break;
            case "*":
                result = String.valueOf(Double.valueOf(numberA) * Double.valueOf(numberB));
                break;
            case "/":
                if(Math.abs(Double.valueOf(numberB) - 0) < 1e-6){
                    throw new ArithmeticException("除数不能为0");
                }
                result = String.valueOf(Double.valueOf(numberA) / Double.valueOf(numberB));
                break;
        }
        return result;
    }
}
