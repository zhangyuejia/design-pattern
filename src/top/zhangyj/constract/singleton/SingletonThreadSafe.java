package top.zhangyj.constract.singleton;

/**
 * 性能不好，每次调用都要加锁
 */
public class SingletonThreadSafe {
    private static SingletonThreadSafe INSTANCE;

    private SingletonThreadSafe(){}

    public static synchronized SingletonThreadSafe getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonThreadSafe();
        }
        return INSTANCE;
    }


}
