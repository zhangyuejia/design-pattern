package top.zhangyj.constract.singleton;

/**
 * 单例模式
 * @author zhangyj
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
