package top.zhangyj.constract.builder.eg;

public class BanzCarModal extends AbstractCarModal{

    @Override
    protected void start() {
        System.out.println("execute BanzCarModal start()");
    }

    @Override
    protected void stop() {
        System.out.println("execute BanzCarModal stop()");
    }

    @Override
    protected void alarm() {
        System.out.println("execute BanzCarModal alarm()");
    }


}
