package test3;

public class baserun extends base{

    protected void a() {
//        super.a();
        System.out.println("baserun a");
    }
    
    public static void main(String[] args) {
        try {
            Class Base = Class.forName("test3.base");
            try {
                Object b = Base.newInstance();
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
