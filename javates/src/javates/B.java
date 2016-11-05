package javates;

public class B extends A{
    @Override
    public void showA(){
        System.out.println("B showA");
    }
    @Override
    public void getA(){
        System.out.println("B getA");
        super.getA();
    }
}
