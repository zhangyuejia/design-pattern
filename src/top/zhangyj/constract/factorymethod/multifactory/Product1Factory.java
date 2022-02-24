package top.zhangyj.constract.factorymethod.multifactory;

import top.zhangyj.constract.factorymethod.AbstractProduct;

public class Product1Factory extends AbstractFactory{
    @Override
    public AbstractProduct createProduct() {
        return new Product1();
    }
}
