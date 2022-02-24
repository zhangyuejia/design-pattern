package top.zhangyj.constract.builder;

public class Bulider extends AbstractBuilder {
    private Product product = new Product();

    @Override
    protected void setPart() {
        System.out.println("产品零件装配");
    }

    @Override
    protected Product buildPart() {
        return product;
    }
}
