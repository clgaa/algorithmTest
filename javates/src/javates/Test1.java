package javates;

import java.lang.reflect.Field;

public class Test1 {
    
//    static {
//        System.out.println("test1");
//    }

    public static void main(String[] args) {
        
        try {
//            Class clazz = Class.forName("javates.Test2");
            
            System.out.println(Test2.class.getName());
            
//            String a = Test2.a;
            Field[] filed = Test2.class.getDeclaredFields();
            Test2.class.newInstance();
            System.out.println(filed[0].getName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
