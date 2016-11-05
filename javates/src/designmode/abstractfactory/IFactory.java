package designmode.abstractfactory;

public interface IFactory {
    ILight generateLight();
    IGlass geneateGlass();
}
