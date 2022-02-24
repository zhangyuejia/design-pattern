package top.zhangyj.constract.factorymethod.multifactory;

import top.zhangyj.constract.factorymethod.AbstractProduct;

abstract class AbstractFactory {
    public abstract AbstractProduct createProduct();
}
