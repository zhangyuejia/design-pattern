package top.zhangyj.structure.proxy.dynamicproxy2;


import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static <T> T newProxyInstance(T t) {
        Class<?> c = t.getClass();
        return (T) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), new MyInvocationHandler(t, new BeforeAdvice(), new AfterAdvice()));
    }
}
