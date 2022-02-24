package top.zhangyj.behavior.visitor;

import java.util.Random;

/**
 * 相当于一个容器，这里使用工厂方法
 */
public class ObjectStructure {
    private static Random random = new Random(2);

    public static Element getElememt(){
        Element element;
        if(random.nextInt(100)>50){
            element = new ConcreteElement1();
        }else{
            element = new ConcreteElement2();
        }
        return element;
    }

    public static void main(String[] args) {
        System.out.println(new Random(100).nextInt(100));
    }
}
