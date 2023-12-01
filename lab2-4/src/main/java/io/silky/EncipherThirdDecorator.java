package io.silky;

public class EncipherThirdDecorator extends EncipherDecorator {
    public EncipherThirdDecorator(EncipherComponent component) {
        super(component);
    }

    @Override
    public String encipherString(String code) {
        String encipheredCode = super.encipherString(code);
        // 第三次加密操作
        return "EncipherThirdDecorator: " + encipheredCode;
    }
}

