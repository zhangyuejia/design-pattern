package top.zhangyj.behavior.iterator;

public interface Iterator<E> {
    boolean hasNext();

    E next();

    void remove(E e);
}
