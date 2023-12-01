package io.silky;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServiceInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        LocalDateTime now = LocalDateTime.now();

        // 设置日期时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.printf("%s success start, time is %s%n", method.getName(),  formattedDateTime);
        Object object = null;
        try {
            object = methodProxy.invokeSuper(o, args);
            System.out.printf("%s success finish%n", method.getName());
        } catch (Exception e) {
            System.out.printf("%s fail finish%n", method.getName());
            System.out.println(e.getMessage());
        }

        return object;
    }
}
