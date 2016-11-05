package fxtest;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        
        Thread t = new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("thread run");
            }
        });
        t.start();
        System.out.println("main run");
        
        System.out.println("main run");
        System.out.println("main run");
        
        Fx<String> fx = new Fx<String>();
//        fx.addT("hello");
//        System.out.println(String.class.getClass().getSimpleName());
//        fx.addT(String.class);
//        System.out.println(fx);
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        arrayList3.add(1);
        try {
            arrayList3.getClass().getMethod("add", Object.class).invoke(arrayList3, "abc");
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i = 0; i < arrayList3.size(); i++){
            System.out.println(arrayList3.get(i));
        }
        ArrayList a = new ArrayList<String>();
        a.add(1);
        a.add("2");
        
        ArrayList<String> b = new ArrayList();
        
    }
}
