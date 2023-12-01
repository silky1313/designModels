package io.silky;

class EncipherSecondDecorator extends EncipherDecorator {
    public EncipherSecondDecorator(EncipherComponent component) {
        super(component);
    }

    @Override
    public String encipherString(String code) {
        String encipheredCode = super.encipherString(code);
        // 第二次加密操作
        return "EncipherSecondDecorator: " + encipheredCode;
    }
}
