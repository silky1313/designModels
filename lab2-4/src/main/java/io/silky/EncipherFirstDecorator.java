package io.silky;

public class EncipherFirstDecorator extends EncipherDecorator {
    public EncipherFirstDecorator(EncipherComponent component) {
        super(component);
    }

    @Override
    public String encipherString(String code) {
        String encipheredCode = super.encipherString(code);
        // 第一次加密操作
        return "EncipherFirstDecorator: " + encipheredCode;
    }
}
