package io.silky;

public class Main {
    public static void main(String[] args) {
        Service service = (Service) ProxyFactory.getProxy(Service.class);
        service.getUserId();
        service.getUserName();
    }
}