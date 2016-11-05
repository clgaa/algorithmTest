package javates;

public class ConcreateClass implements TargetInterface{

    @Override
    public int targetMethodA(int number) {
        // TODO Auto-generated method stub
        System.out.println("A");
        return number;
    }

    @Override
    public int targetMethodB(int number) {
        // TODO Auto-generated method stub
        System.out.println("B");
        return number;
    }

}
