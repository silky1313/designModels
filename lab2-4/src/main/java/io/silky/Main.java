package io.silky;

public class Main {
    public static void main(String[] args) {
        EncipherComponent component = new EncipherConcreteComponent();

        EncipherComponent firstDecorator = new EncipherFirstDecorator(component);
        EncipherComponent secondDecorator = new EncipherSecondDecorator(firstDecorator);
        EncipherComponent thirdDecorator = new EncipherThirdDecorator(secondDecorator);

        // 进行三次加密
        String code = "your_code";
        String encryptedCode = thirdDecorator.encipherString(code);
        System.out.println(encryptedCode);
    }
}