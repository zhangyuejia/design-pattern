package top.zhangyj.constract.builder.eg;

public class BmwCarModal extends AbstractCarModal{

    @Override
    protected void start() {
        System.out.println("execute BmwCarModal start()");
    }

    @Override
    protected void stop() {
        System.out.println("execute BmwCarModal stop()");
    }

    @Override
    protected void alarm() {
        System.out.println("execute BmwCarModal alarm()");
    }


}
