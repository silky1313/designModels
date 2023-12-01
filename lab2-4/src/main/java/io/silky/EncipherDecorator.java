package io.silky;

public abstract class EncipherDecorator implements EncipherComponent {
    private EncipherComponent component;

    public EncipherDecorator(EncipherComponent component) {
        this.component = component;
    }

    @Override
    public String encipherString(String code) {
        return component.encipherString(code);
    }
}
