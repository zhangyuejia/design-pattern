package top.zhangyj.constract.builder;

public class Director {
    private AbstractBuilder builder = new Bulider();

    public Product getProduct(){
        builder.setPart();
        return builder.buildPart();
    }

}
