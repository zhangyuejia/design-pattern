package top.zhangyj.behavior.chainofresponsibility;

public class MiddleHandler extends Handler {
    @Override
    protected Response getResponse(IRequest request) {
        System.out.println("execute MiddleHandler getResponse(IRequest request)");
        return null;
    }

    @Override
    protected Level getLevel() {
        return Level.MIDDLE;
    }
}
