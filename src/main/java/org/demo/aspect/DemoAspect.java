package org.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.demo.util.annotation.Demo;
import org.demo.util.changedatasource.DataSourceManager;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
@Order(1)
public class DemoAspect {

    public void logAddB(JoinPoint point) {
        Object target = point.getTarget();
        String method = point.getSignature().getName();
        Class<?>[] classz = target.getClass().getInterfaces();

        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
        try {
            Method m = classz[0].getMethod(method, parameterTypes);
            if (m != null && m.isAnnotationPresent(Demo.class)) {
                Demo data = m.getAnnotation(Demo.class);
                DataSourceManager.get();
                DataSourceManager.remove();
                DataSourceManager.set(data.db());
            }
        } catch (Exception e) {
            System.out.println("获取注解错误");
            e.printStackTrace();
        }


    }



}
