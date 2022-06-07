package top.zhangyj.behavior.iterator;

/**
 * 行为型模式：迭代器模式
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        IAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("yuejia");
        aggregate.add("yongyu");
        aggregate.add("shuishen");

        Iterator<String> iterator = aggregate.iterator();

        while (iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
