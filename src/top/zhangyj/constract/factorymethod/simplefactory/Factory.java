package top.zhangyj.constract.factorymethod.simplefactory;

import top.zhangyj.constract.factorymethod.Product;

public class Factory {

    public static <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
//        try {
//            product = c.newInstance();
//
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        try {
//            product = (Product) Class.forName(c.getName()).newInstance();
            product = c.getConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
