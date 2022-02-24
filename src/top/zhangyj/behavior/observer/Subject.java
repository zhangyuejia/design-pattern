package top.zhangyj.behavior.observer;

import java.util.Vector;

public abstract class Subject {
    private Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer o: this.observers){
            o.update();
        }
    }
}
