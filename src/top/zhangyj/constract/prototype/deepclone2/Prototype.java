package top.zhangyj.constract.prototype.deepclone2;

import java.io.Serializable;
import java.util.ArrayList;

public class Prototype implements Serializable {
    private ArrayList<String> names;

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

//    @Override
//    protected Prototype clone()  {
//        Prototype prototype = null;
//        try {
//            prototype = (Prototype) super.clone();
//            this.names.clone();
//            prototype.setNames((ArrayList<String>) this.names.clone());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return prototype;
//    }

    public void addName(String name) {
        if(this.names == null){
            this.names = new ArrayList<>();
        }
        this.names.add(name);
    }
}
