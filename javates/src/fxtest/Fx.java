package fxtest;

import java.util.ArrayList;

public class Fx<T> {
    private ArrayList<T> mList = new ArrayList<T>();
    private Class<T> mClass;
    
//    public void addT(T t) {
//        for(int i = 0; i < 2; i++) {
//            mList.add(t);
//        }
//    }
    
    public void addT(Class<T> mClass) {
        try {
            System.out.println(mClass.newInstance());
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "hello";
    }
}
