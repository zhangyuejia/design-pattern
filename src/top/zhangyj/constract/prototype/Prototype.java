package top.zhangyj.constract.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public Prototype(String name) {
        this.name = name;
    }

    @Override
    protected Prototype clone()  {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
