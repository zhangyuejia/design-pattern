package top.zhangyj.constract.singleton;

public class SingletonThreadSafe3 {
    private SingletonThreadSafe3(){}
    /**
     * 静态内部类加载属于懒加载，用到时才会进行加载
     * 推荐使用
     */
    private static class SingletonHolder{
        private static SingletonThreadSafe3 INSTANCE = new SingletonThreadSafe3();
    }

    public static SingletonThreadSafe3 getInstance(){
        return  SingletonHolder.INSTANCE;
    }
}