package top.zhangyj.behavior.iterator;

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
