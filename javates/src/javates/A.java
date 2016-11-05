package javates;

public class A<T> implements Runnable{
    String name;
    String num;
    Integer i;
    public A(String name, String num) {
        this.name = name;
        this.num = num;
    }
    
    public A() {
        
    }
    
   
    public void showA(){
        System.out.println("A show name : " + name);
    }
    
    public void getA(){
        System.out.println("A getA");
        showA();
    }
    
    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            
//            @Override
//            public void run() {
//                // TODO Auto-generated method stub
//                
//            }
//        });
//        t.start();
        
        A a = new A();
        a.i = 0;
        a.i += 1;
        System.out.println("i = " + a.i);
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        if(name.equalsIgnoreCase("a")) {
//            throw new Exception("aaa");
        }
    }
}
