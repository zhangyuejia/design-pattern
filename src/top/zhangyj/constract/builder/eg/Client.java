package top.zhangyj.constract.builder.eg;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.getBanzCarModal().run();
        director.getBmwCarModal().run();
    }
}
