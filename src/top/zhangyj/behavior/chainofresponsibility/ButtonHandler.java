package top.zhangyj.behavior.chainofresponsibility;

public class ButtonHandler extends Handler {

    @Override
    protected Response getResponse(IRequest request) {
        System.out.println("execute ButtonHandler getResponse(IRequest request)");
        return null;
    }

    @Override
    protected Level getLevel() {
        return Level.BUTTON;
    }
}
