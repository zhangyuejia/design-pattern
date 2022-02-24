package top.zhangyj.constract.singleton;

public enum  SingletonThreadSafe4 {
    INSTANCE;

    public SingletonThreadSafe4 getInstance(){
        return INSTANCE;
    }
}
