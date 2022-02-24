package top.zhangyj.constract.flyweight;

public abstract class Flyweight {
    //内部状态
    private String intrinsic;

    //外部状态
    private final String entrinsic;

    protected Flyweight(String entrinsic) {
        this.entrinsic = entrinsic;
    }

    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
