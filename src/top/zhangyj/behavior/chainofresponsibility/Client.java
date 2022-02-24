package top.zhangyj.behavior.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        Handler topHandler = new TopHandler();
        Handler middleHandler = new MiddleHandler();
        Handler buttonHandler = new ButtonHandler();
        topHandler.setNextHandler(middleHandler);
        middleHandler.setNextHandler(buttonHandler);

        IRequest request = new Request();
        topHandler.handleRequest(request);
    }
}
