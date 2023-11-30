package io.silky;

public class EncipherDecorator implements EncipherComponent{
    EncipherDecorator encipherDecorator;

   public EncipherDecorator

    @Override
    public String encipherString(String code) {
        System.out.println("对密码进行加密");
    }
}
