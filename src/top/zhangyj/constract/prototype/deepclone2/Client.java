package top.zhangyj.constract.prototype.deepclone2;


public class Client {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.addName("yuejia");
        Prototype p = CloneUtil.deepClone(prototype);
        System.out.println(prototype.getNames() == p.getNames());
        System.out.println(p.getNames());
        System.out.println(prototype.getNames());
    }
}
