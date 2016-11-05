package designmode.abstractfactory;

public class Q3Factory implements IFactory{

    @Override
    public ILight generateLight() {
        // TODO Auto-generated method stub
        return new Q3light();
    }

    @Override
    public IGlass geneateGlass() {
        // TODO Auto-generated method stub
        return new Q3glass();
    }

   

}
