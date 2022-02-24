package top.zhangyj.behavior.iterator;

public interface IAggregate<E> {
    void add(E e);

    void remove(E e);

    Iterator iterator();
}
