package top.zhangyj.constract.prototype.deepclone;



public class Client {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.addName("yuejia");
        Prototype p = prototype.clone();
        System.out.println(prototype.getNames() == p.getNames());
    }
}
