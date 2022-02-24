package top.zhangyj.constract.prototype.deepclone2;

import java.io.*;

public final class CloneUtil {
    private CloneUtil() { throw new AssertionError(); }
    
    /**
     * 序列化实现深克隆
     * @param t 泛型对象
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T deepClone(T t) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream objOut;
        ObjectInputStream objIn;
        T tClone = null ;
        try {
            objOut = new ObjectOutputStream(out);
             //将对象以二进制流形式写入
             objOut.writeObject(t);
            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            objIn = new ObjectInputStream(in);
            //反序列化读取对象
            tClone = (T)objIn.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tClone;
    }
}