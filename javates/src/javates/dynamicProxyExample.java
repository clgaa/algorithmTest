package javates;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class dynamicProxyExample {
    public static void main(String[] args){
        ConcreateClass c = new ConcreateClass();
        InvocationHandler ih = new dynmicProxy(c);
        
        TargetInterface targetInterface = (TargetInterface) Proxy.newProxyInstance(c.getClass().getClassLoader(), 
                c.getClass().getInterfaces(), ih);
        int i = targetInterface.targetMethodA(5);
        targetInterface.targetMethodB(10);
    }

}
