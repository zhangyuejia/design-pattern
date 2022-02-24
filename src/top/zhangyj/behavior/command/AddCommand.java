package top.zhangyj.behavior.command;

public class AddCommand extends AbstractCommand {
    private Receiver receiver;

    public AddCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("execute AddCommand execute()");
        receiver.doSomething();
    }
}
