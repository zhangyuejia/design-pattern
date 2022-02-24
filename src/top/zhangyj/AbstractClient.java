package top.zhangyj;

import org.junit.Test;

/**
 * @author ZYJ
 */
public abstract class AbstractClient {
    /**
     * 空描述
     */
    private static final String NULL_DESC = "[空]";
    /**
     * 测试方法
     */
    public abstract void test();

    /**
     * 获取描述
     * @return 描述内容
     */
    public abstract String getDesc();
    /**
     *
     */
    @Test
    public final void doTest(){
        System.out.println("测试简介：" + (getDesc() == null? NULL_DESC : getDesc()));
        test();
    }
}
