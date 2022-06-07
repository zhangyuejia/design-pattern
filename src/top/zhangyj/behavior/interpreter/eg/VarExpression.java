package top.zhangyj.behavior.interpreter.eg;

import java.util.Map;

/**
 * 变量解析器
 * @author zhangyj
 */
public class VarExpression extends Expression {

    private final String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
