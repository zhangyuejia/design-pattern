package top.zhangyj.behavior.iterator;

import java.util.Vector;

/**
 * 该类remove有逻辑问题
 * @param <E>
 */
public class ConcreteIterator<E> implements Iterator<E> {
    private int cursor;

    private Vector<E> vector;

    public ConcreteIterator(Vector<E> vector) {
        this.vector = vector;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        if(this.cursor == this.vector.size()){
            return false;
        }
        return true;
    }

    @Override
    public E next() {
        return vector.get(cursor++);
    }

    @Override
    public void remove(E e) {
        this.vector.remove(e);
    }
}
