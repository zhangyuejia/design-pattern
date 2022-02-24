package top.zhangyj.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object object;
    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    private void before(){
        System.out.println("execute MyInvocationHandler before()");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        this.before();
        //result = method.invoke(proxy, args);
        result = method.invoke(object, args);
        this.after();
        return result;
    }

    private void after(){
        System.out.println("execute MyInvocationHandler after()");
    }
}
