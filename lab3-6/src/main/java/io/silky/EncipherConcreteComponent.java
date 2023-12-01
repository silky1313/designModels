package io.silky;

public class EncipherConcreteComponent implements EncipherComponent {
    @Override
    public String encipherString(String code) {
        // 进行具体的加密操作
        return "EncipherConcreteComponent: " + code;
    }
}
