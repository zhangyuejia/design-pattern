package top.zhangyj.structure.adapter.eg;

public class Client {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
