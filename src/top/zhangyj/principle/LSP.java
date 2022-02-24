package top.zhangyj.principle;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 里氏替换原则
 */
public class LSP {
    @Test
    public void testLSP(){
        Father son = new Son();
        Map m = new HashMap();
//        下面报错，Father doSomething永远不会执行m
//        ((Father)son).doSomething(m);
        //Father doSomething exec.
        ((Son) son).doSomething(m);
        //Father doSomething exec.
        son.doSomething1(m);

        ((Son) son).doSomething1(m);
        //Father doSomething exec.
        son.doSomething1(m);
        //Father doSomething exec.
        son.doSomething1(new HashMap());
        //Son doSomething exec.
        ((Son) son).doSomething1(new HashMap());
    }
}
class Father{
    public void doSomething(HashMap map){
        System.out.println("Father doSomething exec.");
    }

    public void doSomething1(Map map){
        System.out.println("Father doSomething exec.");
    }
}
class Son extends Father{
    public void doSomething(Map map){
        System.out.println("Son doSomething exec.");
    }

    public void doSomething1(HashMap map){
        System.out.println("Son doSomething exec.");
    }
}