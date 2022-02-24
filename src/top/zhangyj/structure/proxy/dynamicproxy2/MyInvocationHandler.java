package top.zhangyj.structure.proxy.dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object object;
    private IAdvice beforeAdvice;
    private IAdvice afterAdvice;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    public MyInvocationHandler(Object object, IAdvice beforeAdvice, IAdvice afterAdvice) {
        this.object = object;
        this.beforeAdvice = beforeAdvice;
        this.afterAdvice = afterAdvice;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        if(beforeAdvice != null){
            beforeAdvice.exec();
        }
        result = method.invoke(object, args);
        if(afterAdvice != null){
            afterAdvice.exec();
        }
        return result;
    }
}
