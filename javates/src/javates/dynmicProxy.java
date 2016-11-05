package javates;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class dynmicProxy implements InvocationHandler{
    
    private Object concreateClass;
    
    public dynmicProxy(Object concreateClass) {
        // TODO Auto-generated constructor stub
        this.concreateClass = concreateClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Before invoke method....");
        Object object = method.invoke(concreateClass, args);
        System.out.println("After invoke method...");
        return object;
    }

    
}
