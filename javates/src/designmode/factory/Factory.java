package designmode.factory;

public class Factory {

    public <T extends Iproduct> T factory(Class<T> clazz) {
        Iproduct product = null;
        try {
            product = (Iproduct)Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (T)product;
    }
}
