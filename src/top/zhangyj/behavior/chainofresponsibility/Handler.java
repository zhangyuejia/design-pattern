package top.zhangyj.behavior.chainofresponsibility;

abstract class Handler {
    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private Handler nextHandler;
    public Handler() {
        super();
    }

    public final Response handleRequest(IRequest request){
        Response response = null;
        if(request.getRequestLevel().equals(this.getLevel())){
            response = getResponse(request);
        }else{
            if(nextHandler != null){
                response = nextHandler.handleRequest(request);
            }else{
                System.out.println("no handler.");
            }
        }
        return response;
    }

    protected abstract Response getResponse(IRequest request);
    protected abstract Level getLevel();

}
