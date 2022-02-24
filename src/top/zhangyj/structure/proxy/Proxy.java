package top.zhangyj.structure.proxy;

public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public Proxy(){
        super();
        this.subject = new RealSubject();
    }

    private void before(){
        System.out.println("execute Proxy before()");
    }

    private void after(){
        System.out.println("execute Proxy after()");
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
}
