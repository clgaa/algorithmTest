package designmode.abstractfactory;


public class Q7Factory implements IFactory{

    @Override
    public ILight generateLight() {
        // TODO Auto-generated method stub
        return new Q7light();
    }

    @Override
    public IGlass geneateGlass() {
        // TODO Auto-generated method stub
        return new Q7Glass();
    }

}
