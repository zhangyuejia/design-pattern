package top.zhangyj.behavior.chainofresponsibility;

public class Request implements IRequest {

    @Override
    public Level getRequestLevel() {
        return Level.MIDDLE;
    }
}
