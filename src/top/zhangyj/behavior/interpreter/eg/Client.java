package top.zhangyj.behavior.interpreter.eg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 拦截器模式实现简单加减法计算器（牛逼）
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Calculator calculator = new Calculator(expStr);
        System.out.println("计算结果："+calculator.run(getExpVar(expStr)));
    }

    /**
     * 获取表达式的  变量&值 MAP
     * @param expStr 表达式 如:a+b-c
     * @return 表达式的  变量&值 MAP, eg：{a:1, b:2, c:}
     * @throws IOException 异常
     */
    private static Map<String,Integer> getExpVar(String expStr) throws IOException {
        Map<String, Integer> expMap = new HashMap<>();
        char[] expStrArray = expStr.toCharArray();
        for (char ch : expStrArray) {
            if (ch != '+' && ch != '-' && !expMap.containsKey(String.valueOf(ch))) {
                System.out.print(String.format("请输入%s的值：", ch));
                expMap.put(String.valueOf(ch), Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine()));
            }
        }
        return expMap;
    }

    private static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}
