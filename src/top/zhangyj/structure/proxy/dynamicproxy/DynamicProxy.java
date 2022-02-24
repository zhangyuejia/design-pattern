package top.zhangyj.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy <T>{
    //代理对象
    private Object proxyObject;

    public  DynamicProxy(Object object){
        Class c = object.getClass();
        this.proxyObject = Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), new MyInvocationHandler(object));
    }

    /**
     * 执行代理对象方法
     * @param methodName
     * @param args
     * @return
     */
    public Object invoke(String methodName, Object... args) {
        Class[] classes = new Class[args.length];
        int i = 0;
        for(Object arg : args){
            classes[i] = arg.getClass();
            i++;
        }
        Object result = null;
        try {
            Method method = this.proxyObject.getClass().getMethod(methodName, classes);
            result = method.invoke(proxyObject, args);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }
}
