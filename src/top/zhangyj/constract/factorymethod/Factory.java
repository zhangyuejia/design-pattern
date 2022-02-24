package top.zhangyj.constract.factorymethod;

public class Factory extends AbstractFactory {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
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
