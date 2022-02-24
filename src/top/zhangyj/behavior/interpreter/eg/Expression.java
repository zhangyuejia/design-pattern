package top.zhangyj.behavior.interpreter.eg;

import java.util.Map;

public abstract class Expression {
    /**
     * 解析公式和数值
     * @param var key为公式中的参数，value为参数的值
     */
    public abstract int interpreter(Map<String, Integer> var);
}
