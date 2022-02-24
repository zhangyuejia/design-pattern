package top.zhangyj.constract.singleton;

/**
 * 双重检查单例，必须加上volatale禁止指令重排序
 */
public class SingletonThreadSafe2 {
    private SingletonThreadSafe2(){}

    private static volatile SingletonThreadSafe2 INSTANCE;

    public static SingletonThreadSafe2 getInstance(){
        if (INSTANCE == null){
            synchronized(SingletonThreadSafe2.class){
                if (INSTANCE == null){
                    /*
                    INSTANCE = new SingletonThreadSafe2();
                    可能会发生指令重排序，细分可分为分配内存，创建对象，将对象引用赋值给引用变量
                    后两步如若发生指令重排，则可能出现已经获得引用，INSTANCE!=null 但对象尚未创建完成的情况
                    下一个线程可能会获取到未完成的对象，发生错误。
                    加上volatale即可解决
                     */
                    INSTANCE = new SingletonThreadSafe2();
                }
            }
        }
        return INSTANCE;
    }

}
