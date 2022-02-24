package top.zhangyj.behavior.iterator;

import java.util.Vector;

public class ConcreteAggregate<E> implements IAggregate<E>  {
    private Vector<E> vector = new Vector<>();

    public Vector<E> getVector() {
        return vector;
    }

    public void setVector(Vector<E> vector) {
        this.vector = vector;
    }

    @Override
    public void add(E e) {
        this.vector.add(e);
    }

    @Override
    public void remove(E e) {
        this.vector.remove(e);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
