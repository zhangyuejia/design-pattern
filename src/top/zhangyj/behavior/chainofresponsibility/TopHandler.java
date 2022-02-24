package top.zhangyj.behavior.chainofresponsibility;

public class TopHandler extends Handler {

    @Override
    protected Response getResponse(IRequest request) {
        System.out.println("execute TopHandler getResponse(IRequest request)");
        return null;
    }

    @Override
    protected Level getLevel() {
        return Level.TOP;
    }
}
